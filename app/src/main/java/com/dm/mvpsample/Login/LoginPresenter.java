package com.dm.mvpsample.Login;

/**
 * Created by dm on 2016/9/23.
 */

public interface LoginPresenter {

    /**登录成功后更新数据*/
    void validateCredentials(String userName,String passWord);

    void onDestroy();
}
