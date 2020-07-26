package com.elegion.myfirstapplication;

import java.io.Serializable;
import java.util.Objects;

import static java.util.Objects.requireNonNull;

public final class User implements Serializable {
    private final String mLogin;
    private final String mPassword;

    public User(final String login,final String password) {
        mLogin = requireNonNull(login);
        mPassword = requireNonNull(password);
    }

    public String getLogin() {
        return mLogin;
    }

    public String getPassword() {
        return mPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return mLogin.equals(user.mLogin) &&
                mPassword.equals(user.mPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mLogin, mPassword);
    }
}
