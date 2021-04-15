import styled from 'styled-components';
import React from 'react';
import "../stylesheets/FocusMusic.css";
import ReactPlayer from 'react-player/youtube';
import firebase from '../fire';

export default class FocusMusic extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
    type: "",
    date: "",
    start: false};
  }

  Log_Activity () {
    //e.preventDefault();
    const db = firebase.firestore();
    const bmiRef = db.collection("communications").doc("logMindfulAttempt").set({
      type: "Focus Music",
      start: true
    });
    //alert("activity logged!");
  };

  render() {
    return (
      <div>
        <h3 className="heading">Have important deadlines to meet and want to block out background noise? Concentrate with these Focus Music videos!</h3>
        <div className="allVideos">
          <ul className="videoList">
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=n_wbIhJIQTU" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=di1RycJZH9c" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=wovOYGm3j1g" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=QELY08dm-6g" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
          </ul>
        </div>
      </div>
    )
  }
}







