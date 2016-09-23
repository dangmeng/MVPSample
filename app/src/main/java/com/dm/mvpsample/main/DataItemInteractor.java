package com.dm.mvpsample.main;

import java.util.List;

/**
 * Created by Administrator on 2016/9/23.
 */

public interface DataItemInteractor {

    interface OnDataFinishListener{

        void onFinished(List<String> item);

    }

    void getDataList(OnDataFinishListener listener);

}
