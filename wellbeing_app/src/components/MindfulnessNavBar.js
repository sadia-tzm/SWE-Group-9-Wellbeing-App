import styled from 'styled-components';
import React, { useState } from 'react';
import "../stylesheets/MindfulnessNavBar.css";
import { NavLink } from "react-router-dom";

function MindfulnessNavBar() {

    const [click, setClick] = useState(false);
    const handleClick = () => setClick(!click);

    return (
        <>
            <nav className="M_navbar">
                <div className="M_nav-container">
                    <ul className={click ? "M_nav-menu active" : "M_nav-menu"}>
                        <li className="M_nav-item">
                            <NavLink exact to="/mindfulnesshome" className="M_nav-links" onClick={handleClick}>
                                Mindfulness Home
                            </NavLink>
                        </li>
                        <li className="M_nav-item">
                            <NavLink exact to="/focusmusic" activeClassName="active" className="M_nav-links" onClick={handleClick}>
                                Focus Music
                            </NavLink>
                        </li>
                        <li className="M_nav-item">
                            <NavLink exact to="/guidedmeditation" activeClassName="active" className="M_nav-links" onClick={handleClick}>
                                Guided Meditation
                            </NavLink>
                        </li>
                        <li className="M_nav-item">
                            <NavLink exact to="/breathingexercises" activeClassName="active" className="M_nav-links" onClick={handleClick}>
                                Breathing Exercises
                            </NavLink>
                        </li>
                        <li className="M_nav-item">
                            <NavLink exact to="/mindfulnesshistory" activeClassName="active" className="M_nav-links" onClick={handleClick}>
                                History
                            </NavLink>
                        </li>
                    </ul>
                    <div className="M_nav-icon" onClick={handleClick}>
                    <i className={click ? "fas fa-times" : "fas fa-bars"}></i>
                    </div>
                </div>
            </nav>
        </>
    )
}

export default MindfulnessNavBar;
