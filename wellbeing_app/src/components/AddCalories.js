import styled from 'styled-components';
import React from 'react';
import '../stylesheets/AddCalories.css';

export default class AddCalories extends React.Component {

    render() {
        return (
            <form className="form4">
                <h5 className="heading4">Add Calories</h5>
                <input className="input4"
                    type='text'
                    name='food'
                    placeholder='Food'
                />
                <input className="input4"
                    type='number'
                    name='weight'
                    placeholder="Weight"
                />
                <input className="input4"
                    type='number'
                    name='calories'
                    placeholder="Calories"
                />
                <input className="submit4"
                    type="submit"
                    value="Submit"
                />
            </form>
        )
    }
}







