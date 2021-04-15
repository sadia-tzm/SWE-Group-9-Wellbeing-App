import React from 'react';
import MindfulnessNavBar from './MindfulnessNavBar';
import FocusMusic from './FocusMusic';
import GuidedMeditation from './GuidedMeditation';
import BreathingExercises from './BreathingExercises';
import MindfulnessHome from './MindfulnessHome';
import { Redirect } from "react-router-dom";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

// Mindfulness Main Page
export default class Mindfulness extends React.Component {

  render() {
    return (
      <Router>
        <MindfulnessNavBar />
        <div className="M_pages">
          <Switch>
            <Route exact path="/mindfulnesshome" component={MindfulnessHome}/>
            <Route exact path="/focusmusic" component={FocusMusic}/>
            <Route exact path="/guidedmeditation" component={GuidedMeditation}/>
            <Route exact path="/breathingexercises" component={BreathingExercises}/>
          </Switch>
        </div>
        <Redirect to='mindfulnesshome'/>
      </Router>
    )
  }
}






