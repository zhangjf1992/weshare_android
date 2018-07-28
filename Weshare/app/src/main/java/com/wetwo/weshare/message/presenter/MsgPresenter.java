package com.wetwo.weshare.message.presenter;

import android.content.res.Resources;

import com.wetwo.data.model.adpter.LatestMsg;
import com.wetwo.weshare.R;
import com.wetwo.weshare.message.view.IMsgFragment;

import java.util.ArrayList;
import java.util.List;

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
        List<LatestMsg> latestMsgs=new ArrayList<>();
        LatestMsg latestMsg=new LatestMsg();
        latestMsg.setNickName("泪殇_陌小薰");
        latestMsg.setMsg("帅哥，加微信！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        latestMsg.setTime("9:40");
        latestMsgs.add(latestMsg);
        latestMsgs.add(latestMsg);
        latestMsgs.add(latestMsg);
        latestMsgs.add(latestMsg);
        infoFragment.updateAll(latestMsgs);
    }
}
