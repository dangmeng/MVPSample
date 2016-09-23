package com.dm.mvpsample.Login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Administrator on 2016/9/23.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String userName, final String userPassword, final OnLoginFinishListener loginFinishListener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;

                if (TextUtils.isEmpty(userName)){
                    error = true;
                    loginFinishListener.OnUserNameError();
                }

                if (TextUtils.isEmpty(userPassword)){
                    error = true;
                    loginFinishListener.OnUserPasswordError();
                }

                if (!error){
                    loginFinishListener.OnSuccess();
                }

            }
        },2000);

    }
}
