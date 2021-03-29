import styled from 'styled-components';
import React from 'react';
import '../stylesheets/calorieTracker.css';

export default class CalorieTracker extends React.Component {

  render() {
    return (
      <div>
        <h1>Calorie Tracker </h1>
        <table class="small1">
                <td class="item"><button>Add Food</button></td>
                <td class="item"><button>Delete Food</button></td>
                <td class="item"><button>View Calorie Intake</button></td>
                <td class="item"><button>View Foods</button></td>
        </table>
        </div>
      
    )
  }
}






