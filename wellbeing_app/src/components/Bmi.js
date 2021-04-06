import styled from 'styled-components';
import React from 'react';
import '../stylesheets/Bmi.css';
import { Link } from "react-router-dom";

export default class BMI extends React.Component {

  constructor(props) {
  super(props);
  this.state = {value: ''};
  this.handleSubmit = this.handleSubmit.bind(this);
	}

  handleSubmit(event) {
    alert('A name was submitted: ' + this.state.value);
    event.preventDefault();
  }

  


render() {
  return (
  	<div>
        <form onSubmit ={this.handleSubmit} className="form2">
          <h5 className="heading2">Please input the following:</h5>
          <input className="input2"
            type='text'
            name='height'
            placeholder='Height'
          />
          <input className="input2"
            type='text'
            name='weight'
            placeholder="Weight"
          />
          <input className="submit2"
            type="submit"
            value="Calculate BMI"
            
        />
        </form>



        <Link to="/heightweight">WHY DOESNT THIUS WIRKJS OGMdsjk</Link>
    </div>
    )
	}  
}