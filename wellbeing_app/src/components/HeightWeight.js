import React from 'react';
import '../stylesheets/HeightWeight.css';
import firebase from '../fire';

// Height and Weight Page - display height, weight and bmi history
export default class HeightWeight extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            heights: [],
            weights: [],
            start: false,
            bmis: [],
            dates: [],
            empty: false
        };
    }

    getHistory = e => {
        const db = firebase.firestore();
        const historyRef = db.collection("communications").doc("getBMIHistory").set({
            start: true
        });
        const bmiRef3 = db.collection("communications").doc("response")
            .onSnapshot((doc) => {
                console.log("Current data: ", doc.data());
                const data = doc.data();
                this.setState({
                    heights: data.heights,
                    weights: data.weights,
                    bmis: data.bmis,
                    dates: data.dates,
                    empty: true
                });
                console.log("heights:", this.state.heights);
            });
    }

    componentDidMount() {
        this.getHistory();
    }

    showHeightItems() {
        let heightData = this.state.heights;
        return heightData.map((heightData2) => <li>{heightData2}</li>)
    }

    showWeightItems() {
        let weightData = this.state.weights;
        return weightData.map((weightData2) => <li>{weightData2}</li>)
    }

    showBMIItems() {
        let bmiData = this.state.bmis;
        return bmiData.map((bmiData2) => <li>{bmiData2}</li>)
    }

    showDateItems() {
        let dateData = this.state.dates;
        return dateData.map((dateData2) => <li>{dateData2}</li>)
    }

    render() {
        return (
            <div>
                <table className="styling2">
                    <tr >
                        <th className="firstRow2">Height</th>
                        <th className="firstRow2">Weight</th>
                        <th className="firstRow2">BMI</th>
                    </tr>
                    <tr>
                        <td className="secondRow2">{this.showHeightItems()}</td>
                        <td className="secondRow2">{this.showWeightItems()}</td>
                        <td className="secondRow2">{this.showBMIItems()}</td>
                    </tr>
                </table>
            </div>
        )
    }
}






