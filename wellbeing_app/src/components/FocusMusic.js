import styled from 'styled-components';
import React from 'react';
import "../stylesheets/FocusMusic.css";
import ReactPlayer from 'react-player/youtube';

export default class FocusMusic extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div>
        <h3 className="heading">Have important deadlines to meet and want to block out background noise? Concentrate with these Focus Music videos!</h3>
        <div className="allVideos">
          <ul className="videoList">
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=n_wbIhJIQTU" className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=di1RycJZH9c" className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=wovOYGm3j1g" className="video" height="60vh" width="55vw" controls="true" />
            </li>
            <li>
              <ReactPlayer url="https://www.youtube.com/watch?v=QELY08dm-6g" className="video" height="60vh" width="55vw" controls="true" />
            </li>
          </ul>
        </div>
      </div>
    )
  }
}







