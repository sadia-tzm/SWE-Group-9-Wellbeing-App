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
            calories: "",
            date: "",
            start: false
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
        /*db.settings({
            timestampsInSnapshots: true
        });*/
        const date = new Date(this.state.date);
        const addCaloriesRef = db.collection("communications").doc("addCalories").set({
            food: this.state.food,
            weight: parseInt(this.state.weight, 10),
            calories: parseInt(this.state.calories, 10),
            date: date.toISOString(),
            start: true
        });
        this.setState({
            food: "",
            weight: "",
            calories: "",
            date: ""
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
                {/* <input list ="food" className="input4"  placeholder ="Food"/>

                    
                    <datalist id="food">
                        <option value="Apple"/>
                        <option value="Banana"/>
                        <option value="Pear"/>
                        <option value="Orange"/>
                        <option value="Apricot"/>
                    </datalist> */}
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
                <input className="input4"
                    type='datetime-local'
                    name='date'
                    placeholder = "Date"
                    onChange={this.updateInput}
                    value={this.state.date}
                    
                />
                <input className="submit4"
                    type="submit"
                    value="Submit"
                />
            </form>
            
        )
    }
}







