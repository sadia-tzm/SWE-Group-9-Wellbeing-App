import React from 'react';
import '../stylesheets/ViewCalories.css';
import firebase from "../fire";

// View calories page - displays food and calorie history 
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

                <div >
                    <table className="styling">
                        <tr>
                            <th className="firstRow">Food</th>
                            <th className="firstRow">Calories</th>
                            {/* <th>Date</th> */}
                        </tr>
                        <tr >
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





