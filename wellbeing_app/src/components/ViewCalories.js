import styled from 'styled-components';
import React from 'react';
import '../stylesheets/ViewCalories.css';
import firebase from "../fire";




export default class ViewCalories extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            food: [],
            calories: [],
            date: [],
            ids: [],
            empty: true
        }
    }

    // componentDidMount() {
    //     const db = firebase.firestore();
    //     db.collection("communications").doc("response")
    //         .get()
    //         .then( snapshot => {
    //             const caloriesList = []
    //             snapshot.forEach( doc => {
    //                 const data = doc.data()
    //                 caloriesList.push(data)
    //             })
    //             this.setState({ caloriesList: caloriesList })
    //         })
    //         .catch( error => console.log(error))
    // }

    calorieHistory = e =>  {
        const db = firebase.firestore();
        db.collection("communications").doc("getTotalCalories").set({
            start: true
        });
        db.collection("communications").doc("response")
            .onSnapshot((doc) => {
                console.log("Current data: ", doc.data());
                const data = doc.data();
                this.setState({
                    food: data.food,
                    calories: data.calories,
                    date: data.date,
                    id: data.id, 
                    empty: false
                });
            });
    }

    componentDidMount() {
        this.calorieHistory();
    }
        
 
    render() {
        return (
            <div>
                <h3 class="pagetext">View your Calorie Intake! Keep going, you're on the right track!</h3>

                 <input className="input4"
                    type='date'
                    name='date'
                    placeholder = "Date"
                    
                />

                <div class="grid-container">
                    <div class="heading5">Food</div>
                    <div class="heading5">Calories (kcal)</div>
                    <div class="text5">Weetabix</div>
                    <div class="text5">136</div>
                    <div class="text5">Apple</div>
                    <div class="text5">52</div>
                    <div class="text5">Tesco Margherita Pizza</div>
                    <div class="text5">365</div>
                    <div class="text5">Orange Juice</div>
                    <div class="text5">45</div>
                    <div class="text5">Kinder Bueno</div>
                    <div class="text5">122</div>
                    <div class="text5">Banana</div>
                    <div class="text5">89</div>
                    <div class="total">Total</div>
                    <div class="total">809</div>
                </div>

                {/* {
                    this.state.caloriesList &&
                    this.state.caloriesList.map( calorie => {
                        return (
                            <div>
                                <p>{calorie.food} - {calorie.calorie}</p>
                                <p>{calorie.date}</p>
                            </div>
                        )
                    })
                } */}

                {/* VERSION 2  { 
                    this.state.food &&
                    this.state.food.map( food2 => {
                        return (
                            <div>
                                <h1>food</h1>
                                <p>{food2}</p>
                            </div>
                        )
                    })
                 */}

                <table className={!this.state.empty ? "calorieTable" : ""}>
                    <tr className="calorieHeadings">
                        <th>Food</th>
                        <th>Calories</th>
                        <th>Date</th>
                    </tr>
                    <tr>
                        <td className="calorieTexts">
                            {this.state.food.map((food) =>
                                <h4>{food}</h4>
                            )}
                        </td>
                        <td className="calorieTexts">
                            {this.state.calories.map((calories) =>
                                <h4>{calories}</h4>
                            )}
                        </td>
                        <td className="calorieTexts">
                            {this.state.date.map((date) =>
                                <h4>{date}</h4>
                            )}
                        </td>
                    </tr>
                </table>

            </div>
        )
    }
}





