import styled from 'styled-components';
import React, { useState } from 'react';
import "../stylesheets/NavBar.css";
import { NavLink } from "react-router-dom";

function NavBar({handleLogout}) {

    const [click, setClick] = useState(false);
    const handleClick = () => setClick(!click);
    
    return (
        <>
            <nav className="navbar">
                <div className="nav-container">
                    <NavLink exact to="/" className="nav-logo">
                        Wellbeing App
                    </NavLink>
                    <ul className={click ? "nav-menu active" : "nav-menu"}>
                        <li className="nav-item">
                            <NavLink exact to="/" activeClassName="active" className="nav-links" onClick={handleClick}>
                                Home
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/signup" activeClassName="active" className="nav-links" onClick={handleClick}>
                                Sign Up
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/login" activeClassName="active" className="nav-links" onClick={handleClick}>
                                Login
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/calorietracker" activeClassName="active" className="nav-links" onClick={handleClick}>
                                Calorie Tracker
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/healthinfo" activeClassName="active" className="nav-links" onClick={handleClick}>
                                Health Info
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink exact to="/mindfulness" activeClassName="active" className="nav-links" onClick={handleClick}> 
                                Mindfulness
                            </NavLink>
                        </li>
                        <li className="nav-item">
                            {/* <button className="nav-links" onClick={handleLogout} id="logoutButton">Logout</button> */}
                            <button activeClassName="active" className="nav-links" id="logoutButton" onClick={handleLogout}> 
                                Logout
                            </button>
                        </li>
                    </ul>
                    <div className="nav-icon" onClick={handleClick}>
                    <i className={click ? "fas fa-times" : "fas fa-bars"}></i>
                    </div>
                </div>
            </nav>
        </>
    )
}

export default NavBar;

