import firebase from 'firebase';

var firebaseConfig = {
    apiKey: "AIzaSyCE7oOf6ktQwloZHIuV4ywkx-6UC9mQclc",
    authDomain: "fdm-wellbeing-app.firebaseapp.com",
    projectId: "fdm-wellbeing-app",
    storageBucket: "fdm-wellbeing-app.appspot.com",
    messagingSenderId: "809483850489",
    appId: "1:809483850489:web:aa311114def50617ad8828",
    measurementId: "G-R1RYQM91WM"
};

const fire = firebase.initializeApp(firebaseConfig);

export default fire;