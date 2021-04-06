import styled from 'styled-components';
import React from 'react';
import '../stylesheets/CalorieTrackerHome.css';

export default class CalorieTrackerHome extends React.Component {

    render() {
        return (
            <div>
                <h1 className="CalorieHeading">Welcome to the Calorie Tracker!</h1>
                <br />
                <h3 className="CalorieText">A healthy outside starts from the inside.<br/>Add to, view and edit your calorie intake with our Calorie Tracker!</h3>
            </div>
        )
    }
}







