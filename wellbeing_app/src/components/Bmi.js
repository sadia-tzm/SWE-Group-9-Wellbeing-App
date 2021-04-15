import styled from 'styled-components';
import React from 'react';
import '../stylesheets/Bmi.css';
import { Link } from "react-router-dom";
import firebase from '../fire';

export default class BMI extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      height: "",
      weight: "",
      start: false,
      bmi: null,
      bmiType: "",
      calculate: false
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
      start: true
    });
    this.setState({
      height: "",
      weight: "",
    });
    alert("Your details have been submitted. Click Calculate BMI to see your results!");
  };

  calculate_BMI = e => {
    const db = firebase.firestore();
    const bmiRef2 = db.collection("communications").doc("getBMI").set({
      start: true
    });
    const bmiRef3 = db.collection("communications").doc("response")
      .onSnapshot((doc) => {
        console.log("Current data: ", doc.data());
        const data = doc.data();
        this.setState({
          bmi: data.bmi,
          bmiType: data.bmiType,
          calculate: true
        });
        console.log("calculate:", this.state.calculate);
      });
  };


  render() {
    let { calculate } = this.state.calculate;

    return (
      <div>
        <div className={this.state.calculate ? "bmiContainer" : ""}>
          <h1 className="bmiText">{this.state.bmi}</h1>
          <h1>{this.state.bmiType}</h1>
        </div>
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
            value="Submit Details"
          />
          <button className="submit2" type="button" onClick={this.calculate_BMI}>Calculate BMI</button>
        </form>
      </div>
    )
  }
}