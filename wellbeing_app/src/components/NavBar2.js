
/******************
IGNORE FILE - tried to implement Navbar with Bootstrap

*******************
import React from 'react';
import { Navbar, Nav, Container } from 'react-bootstrap';
import { Link } from 'react-router-dom';

export default class NavBar2 extends React.Component {

    render() {
      return (
        <Navbar collapseOnSelect fixed='top' expand='sm' bg='dark' variant='dark'>
            <Container>
                <Navbar.Toggle aria-controls='responsive-navbar-nav' />
                <Navbar.Collapse id='responsive-navbar-nav'>
                    <Nav>
                        <Nav.Link href='/'>Home</Nav.Link>
                        <Nav.Link href='/login'>Login</Nav.Link>
                        <Nav.Link href='/calorietracker'>Calorie Tracker</Nav.Link>
                        <Nav.Link href='/heightweight'>Height and Weight</Nav.Link>
                        <Nav.Link href='/bmi'>BMI</Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Container>
        </Navbar>
      )
    }
  }

*******************/