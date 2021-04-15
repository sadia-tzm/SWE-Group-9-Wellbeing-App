import React, { useState } from 'react';
import "../stylesheets/CalorieTrackerNavBar.css";
import { NavLink } from "react-router-dom";

// Calorie Tracker Navbar
function CalorieTrackerNavBar() {

    const [click, setClick] = useState(false);
    const handleClick = () => setClick(!click);

    return (
        <>
            <nav className="C_navbar">
                <div className="C_nav-container">
                    <ul className={click ? "C_nav-menu active" : "C_nav-menu"}>
                        <li className="C_nav-item">
                            <NavLink exact to="/calorietrackerhome" className="C_nav-links" onClick={handleClick}>
                                Calorie Tracker Home
                            </NavLink>
                        </li>
                        <li className="C_nav-item">
                            <NavLink exact to="/addcalories" activeClassName="active" className="C_nav-links" onClick={handleClick}>
                                Add Calories
                            </NavLink>
                        </li>
                        <li className="C_nav-item">
                            <NavLink exact to="/viewcalories" activeClassName="active" className="C_nav-links" onClick={handleClick}>
                                View Calories
                            </NavLink>
                        </li>
                        <li className="C_nav-item">
                            <NavLink exact to="/editcalories" activeClassName="active" className="C_nav-links" onClick={handleClick}>
                                Edit Calories
                            </NavLink>
                        </li>
                    </ul>
                    <div className="C_nav-icon" onClick={handleClick}>
                    <i className={click ? "fas fa-times" : "fas fa-bars"}></i>
                    </div>
                </div>
            </nav>
        </>
    )
}

export default CalorieTrackerNavBar;
