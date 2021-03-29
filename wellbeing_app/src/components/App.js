import styled from 'styled-components';
import React from 'react';
import NavBar from './NavBar';
import Home from './Home';
import Login from './Login';
import CalorieTracker from './CalorieTracker';
import HealthInfo from './HealthInfo';
import Mindfulness from './Mindfulness';
//import HeightWeight from './HeightWeight';
//import BMI from './bmi';
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
              <Route exact path="/healthinfo" component={HealthInfo}/>
              <Route exact path="/mindfulness" component={Mindfulness}/>
            </Switch>
          </div>
        </Router>
    )
  }
}





