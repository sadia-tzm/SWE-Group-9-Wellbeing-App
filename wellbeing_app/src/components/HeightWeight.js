import styled from 'styled-components';
import React from 'react';
import '../stylesheets/HeightWeight.css';
import firebase from '../fire';

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
        //if(!this.state.empty){
        this.getHistory();
        // }
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
                {/* <h3 class="pagetext2">View your previously recorded health details</h3>
                <div class="grid-container2">
                    <div class="heading6">Height (cm)</div>
                    <div class="heading6">Weight (Kg)</div>
                    <div class="heading6">BMI</div>
                    <div class="heading6">Date</div>
                    <div class="text6">190</div>
                    <div class="text6">70</div>
                    <div class="text6">25</div>
                    <div class="text6">07/04/21</div>
                    <div class="text6">190</div>
                    <div class="text6">70</div>
                    <div class="text6">25</div>
                    <div class="text6">07/04/21</div>
                    <div class="text6">190</div>
                    <div class="text6">70</div>
                    <div class="text6">25</div>
                    <div class="text6">07/04/21</div>
                    <div class="text6">190</div>
                    <div class="text6">70</div>
                    <div class="text6">25</div>
                    <div class="text6">07/04/21</div>
                </div> */}
                {/* <button onClick={this.getHistory}>Get History</button> */}
                {/* <h4>
                    {this.state.heights.map((heights) =>
                        <h4>Heights: {heights}</h4>
                    )}
                </h4>
                <h4>
                    {this.state.weights.map((weights) =>
                        <h4>Weights: {weights}</h4>
                    )}
                </h4>
                <h4>
                    {this.state.bmis.map((bmis) =>
                        <h4>BMIs: {bmis}</h4>
                    )}
                </h4>
                <h4>
                    {this.state.dates.map((dates) =>
                        <h4>Dates: {dates}</h4>
                    )}
                </h4> */}
                <table className="styling2" /*className={!this.state.empty ? "historyTable" : ""}*/>
                    <tr >
                        <th className="firstRow2">Height</th>
                        <th className="firstRow2">Weight</th>
                        <th className="firstRow2">BMI</th>
                        {/* <th>Date</th> */}
                    </tr>
                    <tr>
                        {/* <td /*className={!this.state.empty ? "historyTexts" : ""}>
                            {this.state.heights.map((heights) =>
                                <h4>{heights}</h4>
                            )}
                        </td>
                        <td /*className={!this.state.empty ? "historyTexts" : ""}>
                            {this.state.weights.map((weights) =>
                                <h4>{weights}</h4>
                            )}
                        </td>
                        <td /*className={!this.state.empty ? "historyTexts" : ""}>
                            {this.state.bmis.map((bmis) =>
                                <h4>{bmis}</h4>
                            )}
                        </td>
                        <td /*className={!this.state.empty ? "historyTexts" : ""}>
                            {this.state.dates.map((dates) =>
                                <h4>{dates}</h4>
                            )}
                        </td> */}
                        <td className="secondRow2">{this.showHeightItems()}</td>
                        <td className="secondRow2">{this.showWeightItems()}</td>
                        <td className="secondRow2">{this.showBMIItems()}</td>
                    </tr>
                </table>
            </div>
        )
    }
}






