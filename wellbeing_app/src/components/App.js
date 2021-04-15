import React from 'react';
import NavBar from './NavBar';
import Home from './Home';
import OldLogin from './OldLogin';
import CalorieTracker from './CalorieTracker';
import HealthInfo from './HealthInfo';
import Mindfulness from './Mindfulness';
import SignUp from './SignUp';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import "../stylesheets/App.css";

// Main App page - accessed once logged in 
const App = (props) => {

    const {
      handleLogout,
    } = props


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





