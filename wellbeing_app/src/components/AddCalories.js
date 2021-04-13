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
        /*db.settings({
            timestampsInSnapshots: true
        });*/
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
                <input list ="food" className="input4"  placeholder ="Food"/>

                    
                    <datalist id="food">
                        <option value="Apple"/>
                        <option value="Banana"/>
                        <option value="Pear"/>
                        <option value="Orange"/>
                        <option value="Apricot"/>
                    </datalist>
                
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
                    type='date'
                    name='date'
                    placeholder = "Date"
                    
                />
                <input className="submit4"
                    type="submit"
                    value="Submit"
                />
            </form>
            
        )
    }
}







