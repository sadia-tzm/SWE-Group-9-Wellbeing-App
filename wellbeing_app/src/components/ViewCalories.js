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

    showFoodItems() {
        let foodData = this.state.food;
        return foodData.map((foodData2) => <li>{foodData2}</li>)
    }

    showCalorieItems() {
        let calorieData = this.state.calories;
        return calorieData.map((calorieData2) => <li>{calorieData2}</li>)
    }

    // showDateItems() {
    //     let dateData = this.state.date;
    //     return dateData.map((dateData2) => <li>{dateData2}</li>)
    // }

    
        
 
    render() {
        return (
            <div>
                <h3 class="pagetext">View your Calorie Intake! Keep going, you're on the right track!</h3>

                 {/* <input className="input4"
                    type='date'
                    name='date'
                    placeholder = "Date"
                    
                /> */}

                {/* <div class="grid-container">
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
                </div> */}

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
                <div >
                    <table className="styling" /*className={!this.state.empty ? "calorieTable" : ""}*/>
                        <tr /*className="calorieHeadings"*/>
                            <th className="firstRow">Food</th>
                            <th className="firstRow">Calories</th>
                            {/* <th>Date</th> */}
                        </tr>
                        <tr >
                            {/* <td /*className={!this.state.empty ? "calorieTexts" : ""}>
                                {this.state.food.map((food) =>
                                    <h4>{food}</h4>
                                )}
                            </td>
                            <td /*className={!this.state.empty ? "calorieTexts" : ""}>
                                {this.state.calories.map((calories) =>
                                    <h4>{calories}</h4>
                                )}
                            </td> */}
                            {/* <td /*className={!this.state.empty ? "calorieTexts" : ""}>
                                {this.state.date.map((date) =>
                                    <h4>{date}</h4>
                                )}
                            </td> */}
                            <td className="secondRow">{this.showFoodItems()}</td>
                            <td className="secondRow">{this.showCalorieItems()}</td>
                            {/* <td>{this.showDateItems()}</td> */}
                        </tr>
                    </table>
                </div>

            </div>
        )
    }
}





