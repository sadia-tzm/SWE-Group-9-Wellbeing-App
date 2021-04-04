import styled from 'styled-components';
import React from 'react';
import '../stylesheets/SignUp.css';

export default class SignUp extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      email: '',
      password: '',
    };
  }

  render() {
    return (
      <form className="form2">
        <h5 className="heading2">Sign Up</h5>
        <input className="input2"
          type='email'
          name='email'
          placeholder='Email/Username'
        />
        <input className="input2"
          type='password'
          name='pwd'
          placeholder="Password"
        />
        <input className="submit2"
          type="submit"
          value="Sign Up"
        />
      </form>
    )
  }
}






