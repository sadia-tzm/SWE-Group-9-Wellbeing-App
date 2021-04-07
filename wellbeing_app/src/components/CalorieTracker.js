import styled from 'styled-components';
import React from 'react';
import CalorieTrackerNavBar from './CalorieTrackerNavBar';
import CalorieTrackerHome from './CalorieTrackerHome';
import AddCalories from './AddCalories';
import ViewCalories from './ViewCalories';
import EditCalories from './EditCalories';
import { NavLink } from "react-router-dom";
import { BrowserRouter as Router, Link, Route, Switch } from "react-router-dom";

export default class CalorieTracker extends React.Component {

  render() {
    return (
      <Router>
        <CalorieTrackerNavBar />
        <div className="C_pages">
          <Switch>
            <Route exact path="/calorietrackerhome" component={CalorieTrackerHome}/>
            <Route exact path="/addcalories" component={AddCalories}/>
            <Route exact path="/viewcalories" component={ViewCalories}/>
            <Route exact path="/editcalories" component={EditCalories}/>
          </Switch>
        </div>
      </Router>
    )
  }
}
