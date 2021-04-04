import styled from 'styled-components';
import React, { useState } from 'react';
import "../stylesheets/HealthInfoNavBar.css";
import { NavLink } from "react-router-dom";

function HealthInfoNavBar() {

    const [click, setClick] = useState(false);
    const handleClick = () => setClick(!click);

    return (
        <>
            <nav className="H_navbar">
                <div className="H_nav-container">
                    <ul className={click ? "H_nav-menu active" : "H_nav-menu"}>
                        <li className="H_nav-item">
                            <NavLink exact to="/healthinfohome" className="H_nav-links" onClick={handleClick}>
                                Health Info Home
                            </NavLink>
                        </li>
                        <li className="H_nav-item">
                            <NavLink exact to="/bmi" activeClassName="active" className="H_nav-links" onClick={handleClick}>
                                BMI
                            </NavLink>
                        </li>
                        <li className="H_nav-item">
                            <NavLink exact to="/heightweight" activeClassName="active" className="H_nav-links" onClick={handleClick}>
                                Height and Weight
                            </NavLink>
                        </li>
                    </ul>
                    <div className="H_nav-icon" onClick={handleClick}>
                    <i className={click ? "fas fa-times" : "fas fa-bars"}></i>
                    </div>
                </div>
            </nav>
        </>
    )
}

export default HealthInfoNavBar;
