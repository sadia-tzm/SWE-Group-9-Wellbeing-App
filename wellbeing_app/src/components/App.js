import styled from 'styled-components';
import React from 'react';
import NavBar from './NavBar';
import Home from './Home';
import Login from './Login';
import CalorieTracker from './CalorieTracker';
import HeightWeight from './HeightWeight';
import BMI from './bmi';
import { BrowserRouter as Router, Link, Route, Switch } from "react-router-dom";
import "../stylesheets/App.css";

export default class App extends React.Component {

  render() {
    return (
        <Router>
          <NavBar />
          <div className="pages">
            <Switch>
              <Route exact path="/" component={Home}/>
              <Route exact path="/login" component={Login}/>
              <Route exact path="/calorietracker" component={CalorieTracker}/>
              <Route exact path="/heightweight" component={HeightWeight}/>
              <Route exact path="/bmi" component={BMI}/>
            </Switch>
          </div>
        </Router>
    )
  }
}





