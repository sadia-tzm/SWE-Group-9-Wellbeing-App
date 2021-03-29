import styled from 'styled-components';
import React from 'react';
import '../stylesheets/Login.css';

export default class Login extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      email: '',
      password: '',
    };
  }

  render() {
    return (
      <form className="form">
        <h5 className="heading">Login</h5>
        <input className="input"
          type='email'
          name='email'
          placeholder='Email/Username'
        />
        <input className="input"
          type='password'
          name='pwd'
          placeholder="Password"
        />
        <input className="submit"
          type="submit"
          value="Log In"
        />
      </form>
    )
  }
}






