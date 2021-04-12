import styled from 'styled-components';
import React from 'react';
import '../stylesheets/AddCalories.css';
import firebase from "../fire";
import { Redirect } from "react-router-dom";

export default class AddCalories extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            food: "",
            weight: "",
            calories: ""
        };
    }

    updateInput = e => {
        this.setState({
            [e.target.name]: e.target.value
        });
    }

    add_calories = e => {
        e.preventDefault();
        const db = firebase.firestore();
        db.settings({
            timestampsInSnapshots: true
        });
        const addCaloriesRef = db.collection("sadiaTest").add({
            food: this.state.food,
            weight: this.state.weight,
            calories: this.state.calories
        });
        this.setState({
            food: "",
            weight: "",
            calories: ""
        });
        // this.changePage();
    };

    // changePage = e => {
    //     return <Redirect to='viewcalories' />
    // }

    render() {
        return (
            <form className="form4" onSubmit={this.add_calories}>
                <h5 className="heading4">Add Calories</h5>
                <input className="input4"
                    type='text'
                    name='food'
                    placeholder='Food'
                    onChange={this.updateInput}
                    value={this.state.food}
                />
                <input className="input4"
                    type='number'
                    name='weight'
                    placeholder="Weight"
                    onChange={this.updateInput}
                    value={this.state.weight}
                />
                <input className="input4"
                    type='number'
                    name='calories'
                    placeholder="Calories"
                    onChange={this.updateInput}
                    value={this.state.calories}
                />
                <input className="submit4"
                    type="submit"
                    value="Submit"
                />
            </form>
        )
    }
}







