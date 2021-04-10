import styled from 'styled-components';
import React from 'react';
import HealthInfoNavBar from './HealthInfoNavBar';
import HealthInfoHome from './HealthInfoHome';
import Bmi from './Bmi';
import HeightWeight from './HeightWeight';
import { NavLink } from "react-router-dom";
import { Redirect } from "react-router-dom";
import { BrowserRouter as Router, Link, Route, Switch } from "react-router-dom";

export default class HealthInfo extends React.Component {

  render() {
    return (
      <Router>
        <HealthInfoNavBar />
        <div className="H_pages">
          <Switch>
            <Route exact path="/healthinfohome" component={HealthInfoHome}/>
            <Route exact path="/bmi" component={Bmi}/>
            <Route exact path="/heightweight" component={HeightWeight}/>
          </Switch>
        </div>
        <Redirect to='healthinfohome'/>
      </Router>
    )
  }
}



















