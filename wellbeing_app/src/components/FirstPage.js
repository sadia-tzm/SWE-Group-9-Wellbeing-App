import React, { useState, useEffect } from 'react';
import fire from '../fire';
import Login from './Login';
import App from './App';

// First Page / Weclome Page - User to login or sign up
const FirstPage = () => {
    const [user, setUser] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [hasAccount, setHasAccount] = useState(false);
    const [username, setUsername] = useState("");
    const [height, setHeight] = useState("");
    const [weight, setWeight] = useState("");
    const [userID, setID] = useState("");
    const [IDcount, setIDcount] = useState(0);
    const [name, setName] = useState("");
    const [dob, setDOB] = useState("");

    const clearInputs = () => {
        setEmail('');
        setPassword('');
    }

    const clearErrors = () => {
        setEmailError('');
        setPasswordError('');
    }

    const handleLogin = () => {
        clearErrors();
        fire
            .auth()
            .signInWithEmailAndPassword(email, password)
            .catch((err) => {
                switch (err.code) {
                    case "auth/invalid-email":
                    case "auth/user-disabled":
                    case "auth/user-not-found":
                        setEmailError(err.message);
                        break;
                    case "auth/wrong-password":
                        setPasswordError(err.message);
                        break;
                }
            });
        const db = fire.firestore();
        const signUpInfo = db.collection("communications").doc("login").set({
            email: email,
            start: true
        });
        db.collection("communications").doc("response")
            .onSnapshot((doc) => {
                console.log("Current data: ", doc.data());
            });
    };

    const handleSignup = () => {
        clearErrors();
        fire
            .auth()
            .createUserWithEmailAndPassword(email, password)
            .catch((err) => {
                switch (err.code) {
                    case "auth/email-already-in-use":
                    case "auth/invalid-email":
                        setEmailError(err.message);
                        break;
                    case "auth/weak-password":
                        setPasswordError(err.message);
                        break;
                }
            });
        const db = fire.firestore();
        const updateDB = db.collection("communications").doc("setupAccount").update({
            start: false
        })
        const date = new Date(dob);
        const signUpInfo = db.collection("communications").doc("setupAccount").set({
            email: email,
            username: username,
            height: parseInt(height, 10),
            weight: parseInt(weight, 10),
            name: name,
            dob: date.toISOString(),
            start: true
        });
        setUsername('');
        setHeight('');
        setWeight('');
        setID('');
        setName('');
        setDOB('');
        db.collection("communications").doc("response")
            .onSnapshot((doc) => {
                console.log("Current data: ", doc.data());
            });
        const updateDB2 = db.collection("communications").doc("login").set({
            start: false
        })
    }

    const handleLogout = () => {
        fire.auth().signOut();
    };

    const authListener = () => {
        fire.auth().onAuthStateChanged((user) => {
            if (user) {
                clearInputs();
                setUser(user);
            } else {
                setUser("");
            }
        });
    };

    useEffect(() => {
        authListener();
    }, []);

    return (
        <div className="App">
            {user ? (
                <App
                    handleLogout={handleLogout}
                />
            ) : (
                <Login
                    email={email}
                    setEmail={setEmail}
                    password={password}
                    setPassword={setPassword}
                    handleLogin={handleLogin}
                    handleSignup={handleSignup}
                    hasAccount={hasAccount}
                    setHasAccount={setHasAccount}
                    emailError={emailError}
                    passwordError={passwordError}
                    username={username}
                    setUsername={setUsername}
                    height={height}
                    setHeight={setHeight}
                    weight={weight}
                    setWeight={setWeight}
                    userID={userID}
                    setID={setID}
                    IDcount={IDcount}
                    setIDcount={setIDcount}
                    name={name}
                    setName={setName}
                    dob={dob}
                    setDOB={setDOB}
                />
            )}
        </div>
    )
};

export default FirstPage;