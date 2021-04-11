import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import FirstPage from './components/FirstPage';
import reportWebVitals from './reportWebVitals';
import * as firebase from 'firebase';


ReactDOM.render(
  <React.StrictMode>
    <FirstPage />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
