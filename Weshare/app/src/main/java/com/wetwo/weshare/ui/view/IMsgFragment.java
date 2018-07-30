package com.wetwo.weshare.ui.view;

import com.wetwo.data.model.adpter.LatestMsg;
import com.wetwo.data.model.im.Information;

import java.util.List;

/**
 * Created by FHZ on 2018/7/12.
 */

public interface IMsgFragment {
    boolean isActive();
    void updateAll(List<LatestMsg> latestMsgs);
}
