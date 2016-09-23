package com.dm.mvpsample.Login;

/**
 * Created by dm on 2016/9/23.
 */

public interface LoginInteractor {

    interface OnLoginFinishListener{

        void OnUserNameError();

        void OnUserPasswordError();

        void OnSuccess();

    }

    void login(String userName,String userPassword,OnLoginFinishListener loginFinishListener);
}
