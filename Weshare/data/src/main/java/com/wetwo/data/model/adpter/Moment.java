package com.wetwo.data.model.adpter;

import java.util.List;

/**
 * Created by FHZ on 2018/7/27.
 */

public class Moment {
    private String headImageUrl;
    private String nickName;
    private String text;
    private List<String> imageUrls;
    private String videoUrls;
    private String time;
    private int type;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getVideoUrls() {
        return videoUrls;
    }

    public void setVideoUrls(String videoUrls) {
        this.videoUrls = videoUrls;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Moment{" +
                "headImageUrl='" + headImageUrl + '\'' +
                ", nickName='" + nickName + '\'' +
                ", text='" + text + '\'' +
                ", imageUrls=" + imageUrls +
                ", videoUrls='" + videoUrls + '\'' +
                ", time='" + time + '\'' +
                ", type=" + type +
                '}';
    }
}
