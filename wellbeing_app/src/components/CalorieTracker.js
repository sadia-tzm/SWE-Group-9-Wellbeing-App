import React from 'react';
import CalorieTrackerNavBar from './CalorieTrackerNavBar';
import CalorieTrackerHome from './CalorieTrackerHome';
import AddCalories from './AddCalories';
import ViewCalories from './ViewCalories';
import EditCalories from './EditCalories';
import { Redirect } from "react-router-dom";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

// Calorie Tracker Page
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
        <Redirect to='calorietrackerhome'/>
      </Router>
    )
  }
}
