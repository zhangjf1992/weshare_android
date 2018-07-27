package com.wetwo.weshare.message.presenter;

import com.wetwo.weshare.message.view.IMsgFragment;

/**
 * Created by FHZ on 2018/7/12.
 */

public class MsgPresenter implements IMsgPresenter {
    IMsgFragment infoFragment;
    public MsgPresenter(IMsgFragment infoFragment) {
        this.infoFragment=infoFragment;
    }

    @Override
    public void loadData() {
        /*
        预留请求info数据逻辑
        */

        infoFragment.update();
    }
}
