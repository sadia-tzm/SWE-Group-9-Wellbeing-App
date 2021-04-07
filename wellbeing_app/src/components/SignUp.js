import styled from 'styled-components';
import React from 'react';
import '../stylesheets/SignUp.css';

export default class SignUp extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      email: '',
      username: '',
      password: '',
    };
  }

  render() {
    return (
      <form className="form3">
        <h5 className="heading3">Sign Up</h5>
        <input className="input3"
          type='email'
          name='email'
          placeholder='Email'
        />
        <input className="input3"
          type='text'
          name='username'
          placeholder='Username'
        />
        <input className="input3"
          type='password'
          name='pwd'
          placeholder="Password"
        />
        <input className="input3"
          type='number'
          name='height'
          placeholder='Height (m)'
          step='0.01'
        />
        <input className="input3"
          type='number'
          name='weight'
          placeholder='Weight (kg)'
          step='0.01'
        />
        <input className="submit3"
          type="submit"
          value="Sign Up"
        />
      </form>
    )
  }
}






