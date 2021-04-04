import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import App from './components/App';


import HealthInfo from "./components/HealthInfo";
import BMI from "./components/BMI";

const rootElement = document.getElementById("root");
ReactDOM.render(
    <BrowserRouter>
        <Switch>
            <Route exact path="/" component={HealthInfo} />
            <Route path="/BMI" component={BMI} />
        </Switch>
    </BrowserRouter>,
    rootElement
);