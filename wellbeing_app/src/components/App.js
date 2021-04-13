import styled from 'styled-components';
import React, { useEffect } from 'react';
import NavBar from './NavBar';
import Home from './Home';
import OldLogin from './OldLogin';
import CalorieTracker from './CalorieTracker';
import HealthInfo from './HealthInfo';
import Mindfulness from './Mindfulness';
import SignUp from './SignUp';
import fire from '../fire';
import { BrowserRouter as Router, Link, Route, Switch } from "react-router-dom";
import "../stylesheets/App.css";

/*const App = ({ handleLogout }) => { */
const App = (props) => {

    const {
      handleLogout,
      userID,
      setID,
      IDcount,
      setIDcount
    } = props

    const IDsetUp = () => {
      const db = fire.firestore();
      setIDcount(IDcount+1);
      var IDstring = IDcount.toString();
      const signUpInfo = db.collection("signUpTest").doc(IDstring).update({
          //userID: fire.auth().currentUser.uid,
          userID: {IDstring},
      });
    }

    useEffect(() => {
      IDsetUp();
    }, []);

    return (
        <Router>
          <NavBar handleLogout={handleLogout} />
          <div className="pages">
            <Switch>
              <Route exact path="/" component={Home}/>
              <Route exact path="/signup" component={SignUp}/>
              <Route exact path="/login" component={OldLogin}/>
              <Route exact path="/calorietracker" component={CalorieTracker}/>
              <Route exact path="/healthinfo" component={HealthInfo}/>
              <Route exact path="/mindfulness" component={Mindfulness}/>
            </Switch>
          </div>
        </Router>
    );
};

export default App;





