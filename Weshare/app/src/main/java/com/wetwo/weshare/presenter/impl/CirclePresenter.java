package com.wetwo.weshare.presenter.impl;

import com.wetwo.data.model.adpter.LatestMsg;
import com.wetwo.data.model.adpter.Moment;
import com.wetwo.weshare.adapter.MomentsRecyclerViewAdapter;
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
        List<Moment> moments=new ArrayList<>();
        Moment moment=new Moment();
        moment.setType(MomentsRecyclerViewAdapter.MOMENT_HOLDER_ONE_PICTURE_TYPE);
        Moment moment1=new Moment();
        moment1.setType(MomentsRecyclerViewAdapter.MOMENT_HOLDER_MORE_PICTURE_TYPE);
        Moment moment2=new Moment();
        moment2.setType(MomentsRecyclerViewAdapter.MOMENT_HOLDER_VIDEO_TYPE);
        moments.add(moment);
        moments.add(moment1);
        moments.add(moment2);
        circleFragment.updateAll(moments);
    }
}
