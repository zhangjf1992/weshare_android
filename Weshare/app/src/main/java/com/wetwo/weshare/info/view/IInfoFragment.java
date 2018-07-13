package com.wetwo.weshare.info.view;

import android.content.Context;

import com.wetwo.data.model.Information;

import java.util.List;

/**
 * Created by FHZ on 2018/7/12.
 */

public interface IInfoFragment {
    boolean isActive();
    void onDataLoaded(List<Information> informationList);
    void update();
}
