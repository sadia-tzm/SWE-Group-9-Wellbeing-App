import styled from 'styled-components';
import React from 'react';
import "../stylesheets/FocusMusic.css";
import ReactPlayer from 'react-player/youtube';

export default class GuidedMeditation extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div>
        <h3 className="heading">Need to decompress and reset? Relax and rejuvenate with these Guided Meditation videos!</h3>
        <div className="allVideos">
          <ul className="videoList">
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=QHkXvPq2pQE" className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=BR6yH4S1UMU" className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=sG7DBA-mgFY" className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=cZJAsW_5SRA" className="video" height="60vh" width="55vw" controls="true" />
            </li>
          </ul>
        </div>
      </div>
    )
  }
}







