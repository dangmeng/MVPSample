package com.dm.mvpsample.main;

import java.util.List;

/**
 * Created by dm on 2016/9/23.
 */

public class MainPresenterImpl implements MainPresenter,DataItemInteractor.OnDataFinishListener {

    private MainView mainView;
    private DataItemInteractor interactor;

    public MainPresenterImpl(MainView mainView, DataItemInteractor interactor) {
        this.mainView = mainView;
        this.interactor = interactor;
    }

    @Override
    public void onFinished(List<String> item) {
        if (mainView != null){
            mainView.hideProgress();
            mainView.setItem(item);
        }
    }

    @Override
    public void onResume() {
        if (mainView != null){
            mainView.showProgress();
        }
        interactor.getDataList(this);
    }

    @Override
    public void onDestroy() {
        if (mainView != null)
        mainView = null;
    }

    @Override
    public void onItemClick(int position) {
        if (mainView != null){
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }
}
