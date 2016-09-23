package com.dm.mvpsample.main;

/**
 * Created by Administrator on 2016/9/23.
 */

public interface MainPresenter {

    void onResume();

    void onDestroy();

    void onItemClick(int position);

}
