import React from 'react';
import "../stylesheets/FocusMusic.css";
import ReactPlayer from 'react-player/youtube';
import firebase from '../fire';

// Guided Meditation Page
export default class GuidedMeditation extends React.Component {
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
        type: "Guided Meditation",
        start: true
      });
      //alert("activity logged!");
    };

  render() {
    return (
      <div>
        <h3 className="heading">Need to decompress and reset? Relax and rejuvenate with these Guided Meditation videos!</h3>
        <div className="allVideos">
          <ul className="videoList">
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=QHkXvPq2pQE" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=BR6yH4S1UMU" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=sG7DBA-mgFY" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=cZJAsW_5SRA" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
          </ul>
        </div>
      </div>
    )
  }
}







