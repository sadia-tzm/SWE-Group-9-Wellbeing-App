import styled from 'styled-components';
import React from 'react';
import '../stylesheets/HealthInfo.css';
import { Link } from "react-router-dom";


export default class HealthInfoHome extends React.Component {
  constructor(props) {
    super(props);
  
    this.state = {
      height: '',
      weight: '',
    };
  }

  render() {
    return (

      <div className="background">
        <h1 className="homeHeading">Welcome to the Health Info Page!</h1>
        <br/>
        <h3 className="text"> Here you will find resources to track<br/>Height, Weight and BMI.</h3>
      </div>

    )
  }
}












