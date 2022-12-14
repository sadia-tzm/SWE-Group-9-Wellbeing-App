import React from 'react';
import '../stylesheets/OldLogin.css';

// Old login page - no longer used
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
        <h5 className="heading1">Login</h5>
        <input className="input"
          type='email'
          name='email'
          placeholder='Email/Username'
          required
        />
        <input className="input"
          type='password'
          name='pwd'
          placeholder="Password"
          required
        />
        <input className="submit"
          type="submit"
          value="Log In"
        />
      </form>
    )
  }
}






