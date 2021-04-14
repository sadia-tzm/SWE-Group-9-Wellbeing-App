import styled from 'styled-components';
import React from 'react';
import '../stylesheets/Bmi.css';
import { Link } from "react-router-dom";
import firebase from '../fire';

export default class BMI extends React.Component {

  constructor(props) {
    super(props);
    // this.state = {value: ''};
    // this.handleSubmit = this.handleSubmit.bind(this);
    this.state = {
      height: "",
      weight: "",
      start: false
    };
  }

  // handleSubmit(event) {
  //   alert('TESTING : ' + this.state.value);
  //   event.preventDefault();
  // }

  updateInput = e => {
    this.setState({
      [e.target.name]: e.target.value
    });
  }

  submit_BMI = e => {
    e.preventDefault();
    const db = firebase.firestore();
    const bmiRef = db.collection("communications").doc("updateBMI").set({
      height: parseInt(this.state.height, 10),
      weight: parseInt(this.state.weight, 10),
      // date: this.state.date.toString(),
      start: true
    });
    this.setState({
      height: "",
      weight: "",
      // date: ""
    });
  };


  render() {
    return (
      <div>
        <form onSubmit={this.submit_BMI} className="form2">
          <h5 className="heading2">Please input the following:</h5>
          <input className="input2"
            type='number'
            name='height'
            placeholder='Height'
            onChange={this.updateInput}
            value={this.state.height}
          />
          <input className="input2"
            type='number'
            name='weight'
            placeholder="Weight"
            onChange={this.updateInput}
            value={this.state.weight}
          />
          <input className="submit2"
            type="submit"
            value="Calculate BMI"
          />
        </form>
      </div>
    )
  }
}