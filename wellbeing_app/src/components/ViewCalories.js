import styled from 'styled-components';
import React from 'react';
import '../stylesheets/ViewCalories.css';

export default class ViewCalories extends React.Component {

    render() {
        return (
            <div>
                <h3 class="pagetext">View your Calorie Intake! Keep going, you're on the right track!</h3>
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
            </div>
        )
    }
}







