import styled from 'styled-components';
import React from 'react';
import '../stylesheets/HeightWeight.css';
import firebase from '../fire';

export default class HeightWeight extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            aNumbers: [],
            aDates: [],
            aTypes: [],
            start: false,
            empty: false
        };
    }

    getHistory = e => {
        const db = firebase.firestore();
        const historyRef = db.collection("communications").doc("getMindfulHistory").set({
            start: true
        });
        const mindhistref = db.collection("communications").doc("response")
            .onSnapshot((doc) => {
                console.log("Current data: ", doc.data());
                const data = doc.data();
                this.setState({
                    aNumbers: data.attempmptNos,
                    aTypes: data.attemptTypes,
                    aDates: data.bmis,
                    empty: true
                });
                console.log("types:", this.state.aTypes);
            });
    }

    componentDidMount() {
        //if(!this.state.empty){
        this.getHistory();
        // }
    }

    render() {
        return (
            <div>
                <div>HELLO</div>
                {this.state.aNumbers.map((number, i) => (<div>aNumbers[{i}]</div>))}
                {/* <table className={!this.state.empty ? "historyTable" : ""}>
                    <tr className="historyHeadings">
                        <th>No</th>
                        <th>Type</th>
                        <th>Date</th>
                    </tr>
                    <tr>
                        <td className="historyTexts">
                            {this.state.heights.map((heights) =>
                                <h4>{heights}</h4>
                            )}
                        </td>
                        <td className="historyTexts">
                            {this.state.weights.map((weights) =>
                                <h4>{weights}</h4>
                            )}
                        </td>
                        <td className="historyTexts">
                            {this.state.bmis.map((bmis) =>
                                <h4>{bmis}</h4>
                            )}
                        </td>
                    </tr>
                </table> */}
            </div>
        )
    }
}






