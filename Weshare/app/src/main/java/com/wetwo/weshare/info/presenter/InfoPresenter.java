package com.wetwo.weshare.info.presenter;

import android.content.Context;

import com.wetwo.data.model.Information;
import com.wetwo.weshare.info.view.IInfoFragment;

import java.util.List;

/**
 * Created by FHZ on 2018/7/12.
 */

public class InfoPresenter implements  IInfoPresenter{
    IInfoFragment infoFragment;
    public InfoPresenter(IInfoFragment infoFragment) {
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
