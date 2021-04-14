import React, { useState, useEffect } from 'react';
import fire from '../fire';
import Login from './Login';
import App from './App';

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
    // const [start, setStart] = useState(false);

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
        //email = convertUsernameToEmail();
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
        setIDcount(IDcount+1);
        var IDstring = IDcount.toString();
        const signUpInfo = db.collection("communications").doc("setupAccount").set({
        /* const signUpInfo = db.collection("signupTest2").doc(username).set({ */
            email: email,
            //password: {password},
            username: username,
            // userID: {IDstring},
            // userID: {username},
            // id: email,
            height: parseInt(height, 10),
            weight: parseInt(weight, 10),
            name: name,
            dob: dob,
            start: true
        });
        setUsername('');
        setHeight('');
        setWeight('');
        setID('');
        setName('');
        setDOB('');
        // setStart(false);
    }

    const handleLogout = () => {
        fire.auth().signOut();
    };

    const authListener = () => {
        fire.auth().onAuthStateChanged((user) => {
            if (user) {
                clearInputs();
                setUser(user);
                //const id = fire.auth().currentUser.uid;
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
                    userID={userID}
                    setID={setID}
                    IDcount={IDcount}
                    setIDcount={setIDcount}
                    email={email}
                    username={username}
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