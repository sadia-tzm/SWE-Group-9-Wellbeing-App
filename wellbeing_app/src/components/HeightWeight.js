import styled from 'styled-components';
import React from 'react';
import '../stylesheets/HeightWeight.css';

export default class HeightWeight extends React.Component {

  render() {
    return (
      <div>
          <h1 className = "TableHeading">Table</h1>
            <table className = "HeightWeightTable">
              <tr>
                <th>Height (cm)</th>
                <th>Weight (kg)</th>
                <th>Date</th>
              </tr>
              <tr>
                <td>190</td>
                <td>70</td>
                <td>05/04/21</td>
              </tr>
              <tr>
                <td>190</td>
                <td>70</td>
                <td>05/04/21</td>
              </tr>
              <tr>
                <td>190</td>
                <td>70</td>
                <td>05/04/21</td>
              </tr>
              <tr>
                <td>190</td>
                <td>70</td>
                <td>05/04/21</td>
              </tr>
              <tr>
                <td>190</td>
                <td>70</td>
                <td>05/04/21</td>
              </tr>
            </table>
            
              <div className = "item">
                <button className = "TableButton">Press me</button>
                <br></br>
                <br></br>
                <button className = "TableButton">Press me</button>
              </div>
            


    </div>
    )
  }
}







