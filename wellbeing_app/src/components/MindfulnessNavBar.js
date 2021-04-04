import styled from 'styled-components';
import React from 'react';
import "../stylesheets/MindfulnessNavBar.css";
import { NavLink } from "react-router-dom";

export default class MindfulnessNavBar extends React.Component {

    render() {

        return (
            <nav className="M_navbar">
                <div className="M_nav-container">
                    <ul className="M_nav-menu">
                        <li className="M_nav-item">
                            <NavLink exact to="/mindfulnesshome" className="M_nav-links">
                                Mindfulness Home
                            </NavLink>
                        </li>
                        <li className="M_nav-item">
                            <NavLink exact to="/focusmusic" activeClassName="active" className="M_nav-links">
                                Focus Music
                            </NavLink>
                        </li>
                        <li className="M_nav-item">
                            <NavLink exact to="/guidedmeditation" activeClassName="active" className="M_nav-links">
                                Guided Meditation
                            </NavLink>
                        </li>
                        <li className="M_nav-item">
                            <NavLink exact to="/breathingexercises" activeClassName="active" className="M_nav-links">
                                Breathing Exercises
                            </NavLink>
                        </li>
                    </ul>

                </div>
            </nav>
        )
    }
}
