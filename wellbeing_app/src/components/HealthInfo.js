import styled from 'styled-components';
import React from 'react';
import '../stylesheets/HealthInfo.css';
import { Link } from "react-router-dom";





export default class HealthInfo extends React.Component {
  constructor(props) {
    super(props);
  
    this.state = {
      height: '',
      weight: '',
    };
  }

  render() {
    return (
      <div>
        <h1 className="homeHeading2">Health Info</h1>
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

        <Link to="/BMI">s\fdsf\sdf\sdf\sdf\sdf</Link>
      


    
      </div>
    )
  }
}












