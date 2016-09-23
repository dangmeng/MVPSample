package com.dm.mvpsample.Login;

/**
 * Created by dm on 2016/9/23.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUserNameError();

    void setUserPasswordError();

    void navigateToHome();

}
