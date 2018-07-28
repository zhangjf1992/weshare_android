package com.wetwo.data.model.adpter;

/**
 * Created by FHZ on 2018/7/27.
 */

public class LatestMsg {
    private String headImageUrl;
    private String nickName;
    private String msg;
    private String time;

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LatestMsg{" +
                "headImageUrl='" + headImageUrl + '\'' +
                ", nickName='" + nickName + '\'' +
                ", msg='" + msg + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
