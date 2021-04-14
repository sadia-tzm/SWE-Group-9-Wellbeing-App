import React from 'react';
import '../stylesheets/Login.css'

const Login = (props) => {
    const {
        email,
        setEmail,
        password,
        setPassword,
        handleLogin,
        handleSignup,
        hasAccount,
        setHasAccount,
        emailError,
        passwordError,
        username,
        setUsername,
        height,
        setHeight,
        weight,
        setWeight,
        userID,
        setID,
        IDcount,
        setIDcount,
        name,
        setName,
        dob,
        setDOB
    } = props;

    return (
        <section className="login">
            <div className="form_L">
                <h5 className="heading_L">Welcome</h5>
                { /* <label>Username</label> */}
                <input className="input_L"
                    type="email"
                    autoFocus
                    required
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                    placeholder="Email"
                />
                <p className="errorMsg_L">{emailError}</p>
                {/* <label>Password</label> */}
                <input className="input_L"
                    type="password"
                    required
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    placeholder="Password"
                />
                <p className="errorMsg_L">{passwordError}</p>
                <div className="btnContainer">
                    {!hasAccount ? (
                        <>
                            <button onClick={handleLogin} className="button_L">Sign in</button>
                            <p className="text_L">
                                Don't have an account?
                                <span id="span_L" onClick={() => setHasAccount(!hasAccount)}>Sign up</span>
                            </p>
                        </>
                    ) : (
                        <>
                            <input className="input_L"
                                type="text"
                                required
                                value={name}
                                onChange={(e) => setName(e.target.value)}
                                placeholder="Name"
                            />
                            <input className="input_L" id="username"
                                type="text"
                                required
                                value={username}
                                onChange={(e) => setUsername(e.target.value)}
                                placeholder="Username"
                            />
                            <label className="inputLabel">Date of Birth</label>
                            <input className="input_L" id="dob"
                                type="datetime-local"
                                required
                                value={dob}
                                onChange={(e) => setDOB(e.target.value)}
                                placeholder="Date of Birth"
                            />
                            <input className="input_L"
                                type="height"
                                required
                                value={height}
                                onChange={(e) => setHeight(e.target.value)}
                                placeholder="Height"
                            />
                            <input className="input_L"
                                type="weight"
                                required
                                value={weight}
                                onChange={(e) => setWeight(e.target.value)}
                                placeholder="Weight"
                            />
                            <button onClick={handleSignup} className="button_L">Sign up</button>
                            <p className="text_L">
                                Have an account?
                                <span id="span_L" onClick={() => setHasAccount(!hasAccount)}>Sign in</span>
                            </p>
                        </>
                    )}
                </div>
            </div>
        </section>
    )
};

export default Login;