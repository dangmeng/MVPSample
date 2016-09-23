package com.dm.mvpsample.Login;

/**
 * Created by dm on 2016/9/23.
 */

public class LoginPresenterImpl implements LoginPresenter , LoginInteractor.OnLoginFinishListener {

    private LoginView mLoginView;
    private LoginInteractor mLoginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        mLoginView = loginView;
        mLoginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String userName, String passWord) {

        if (mLoginView != null){
            mLoginView.showProgress();
        }

        mLoginInteractor.login(userName,passWord,this);

    }

    @Override
    public void onDestroy() {
        mLoginView = null;
    }

    @Override
    public void OnUserNameError() {

        if (mLoginView != null){
            mLoginView.setUserNameError();
            mLoginView.hideProgress();
        }

    }

    @Override
    public void OnUserPasswordError() {

        if (mLoginView != null){
            mLoginView.setUserPasswordError();
            mLoginView.hideProgress();
        }

    }

    @Override
    public void OnSuccess() {

        if (mLoginView != null) {
            mLoginView.navigateToHome();
        }

    }
}
