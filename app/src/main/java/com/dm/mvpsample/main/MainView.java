package com.dm.mvpsample.main;

import java.util.List;

/**
 * Created by Administrator on 2016/9/23.
 */

public interface MainView {

    void showProgress();

    void hideProgress();

    void showMessage(String message);

    void setItem(List<String> item);

}
