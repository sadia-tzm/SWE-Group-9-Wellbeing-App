import styled from 'styled-components';
import React from 'react';
import "../stylesheets/FocusMusic.css";
import ReactPlayer from 'react-player/youtube';
import firebase from '../fire';

export default class BreathingExercises extends React.Component {
    constructor(props){
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
            type: "Breathing Excercise",
            start: true
          });
          //alert("activity logged!");
        };

  render() {
    return (
      <div>
        <h3 className="heading">Stressed and anxious? Unwind and calm down with these Breathing Exercises...</h3>
        <div className="allVideos">
          <ul className="videoList">
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=aNXKjGFUlMs" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=uxayUBd6T7M" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=iaQed_Xdyvw" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=5DqTuWve9t8" onStart = {this.Log_Activity} className="video" height="60vh" width="55vw" controls="true" />
            </li>
          </ul>
        </div>
      </div>
    )
  }
}







