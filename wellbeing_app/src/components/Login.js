import React from 'react';
import '../stylesheets/Login.css'

const Login2 = (props) => {
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
        passwordError
    } = props;

    return ( 
        <section className="login">
            <div className="form_L">
                <h5 className="heading_L">Welcome</h5>
                { /* <label>Username</label> */ } 
                <input className="input_L"
                    type="text" 
                    autoFocus 
                    required
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                    placeholder="Username" 
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
                    {hasAccount ? (
                        <>
                            <button onClick={handleLogin} className="button_L">Sign in</button>
                            <p className="text_L">
                                Don't have an account?
                                <span id="span_L" onClick={() => setHasAccount(!hasAccount)}>Sign up</span>
                            </p>
                        </>
                    ) : (
                        <>
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

export default Login2;