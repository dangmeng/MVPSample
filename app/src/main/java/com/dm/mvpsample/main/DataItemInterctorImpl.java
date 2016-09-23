package com.dm.mvpsample.main;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/9/23.
 */

public class DataItemInterctorImpl implements DataItemInteractor {
    @Override
    public void getDataList(final OnDataFinishListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(createList());
            }
        }, 2000);
    }

    List<String> createList(){
        return Arrays.asList(
                "item1",
                "item2",
                "item3",
                "item4",
                "item5",
                "item6",
                "item7",
                "item8",
                "item9",
                "item10"
        );
    }
}
