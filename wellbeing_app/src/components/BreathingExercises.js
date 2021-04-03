import styled from 'styled-components';
import React from 'react';
import "../stylesheets/FocusMusic.css";
import ReactPlayer from 'react-player/youtube';

export default class BreathingExercises extends React.Component {
    constructor(props){
        super(props);
    }

  render() {
    return (
      <div>
        <h3 className="heading">Stressed and anxious? Unwind and calm down with these Breathing Exercises...</h3>
        <div className="allVideos">
          <ul className="videoList">
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=aNXKjGFUlMs" className="video" height="60vh" width="50vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=uxayUBd6T7M" className="video" height="60vh" width="50vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=iaQed_Xdyvw" className="video" height="60vh" width="50vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=5DqTuWve9t8" className="video" height="60vh" width="50vw" controls="true" />
            </li>
          </ul>
        </div>
      </div>
    )
  }
}







