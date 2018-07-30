package com.wetwo.weshare.ui.view;

import com.wetwo.data.model.adpter.Moment;

import java.util.List;

/**
 * Created by FHZ on 2018/7/30.
 */

public interface ICircleFragment {
    boolean isActive();
    void updateAll(List<Moment> moments);
}
