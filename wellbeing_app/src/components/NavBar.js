import styled from 'styled-components';
import React from 'react';
import "../stylesheets/NavBar.css";
import { NavLink } from "react-router-dom";

export default class NavBar extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            isExpanded: false
        }
    }

    handleToggle(e) {
        e.preventDefault();
        /*alert(this.state.isExpanded);*/
        this.setState({
          isExpanded: !this.state.isExpanded
        });
      }

    handleClick() {
        this.setState({
            isExpanded: !this.state.isExpanded
        })
    }

    render() {
        const { isExpanded } = this.state;

        return (
            <nav className="navbar">
                <div className="nav-container">
                    <NavLink exact to="/" className="nav-logo">
                        Wellbeing App
                        {/*<i className="fas fa-code"></i> add link in index.html*/}
                    </NavLink>
                    {/* ul --> className="nav-menu" */}
                    {/* SWAP NAV-MENU ACTIVE AND NAV MENU*/}
                    <ul className={(this.state.isExpanded ? "nav-menu active" : "nav-menu")}>
                        <li className="nav-item">
                            <NavLink exact to="/" activeClassName="active" className="nav-links" /*onClick={this.handleClick}*/>
                                Home
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/login" activeClassName="active" className="nav-links" /*onClick={this.handleClick}*/>
                                Login
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/calorietracker" activeClassName="active" className="nav-links" /*onClick={this.handleClick}*/>
                                Calorie Tracker
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/heightweight" activeClassName="active" className="nav-links" /*onClick={this.handleClick}*/>
                                Height and Weight
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/bmi" activeClassName="active" className="nav-links" /*onClick={this.handleClick}*/> 
                                BMI
                            </NavLink>
                        </li>
                    </ul>
                    <div className="nav-icon">
                        <i className="fa fa-bars" aria-hidden="true" onClick={e => this.handleToggle(e)}/>
                    </div>

                </div>
            </nav>
        )
    }
}
