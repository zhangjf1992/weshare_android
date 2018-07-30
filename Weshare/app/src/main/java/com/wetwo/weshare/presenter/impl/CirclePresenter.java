package com.wetwo.weshare.presenter.impl;

import com.wetwo.data.model.adpter.LatestMsg;
import com.wetwo.data.model.adpter.Moment;
import com.wetwo.weshare.presenter.ICirclePresenter;
import com.wetwo.weshare.presenter.IMsgPresenter;
import com.wetwo.weshare.ui.view.ICircleFragment;
import com.wetwo.weshare.ui.view.IMsgFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FHZ on 2018/7/12.
 */

public class CirclePresenter implements ICirclePresenter {
    ICircleFragment circleFragment;
    public CirclePresenter(ICircleFragment circleFragment) {
        this.circleFragment=circleFragment;
    }

    @Override
    public void loadData() {
        /*
        预留请求info数据逻辑
        */
        circleFragment.updateAll(new ArrayList<Moment>());
    }
}
