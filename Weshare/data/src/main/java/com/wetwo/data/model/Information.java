package com.wetwo.data.model;

import java.util.List;

public class Information {
    private int id;
    private int userId;
    private String latitude;
    private String longitude;
    private List<InterestPoint> interestPoints;
    private List<Tag> tags;
    private String title;
    private String content;
    private List<Picture> pictures;
    private List<Video> videos;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<InterestPoint> getInterestPoints() {
        return interestPoints;
    }

    public void setInterestPoints(List<InterestPoint> interestPoints) {
        this.interestPoints = interestPoints;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id=" + id +
                ", userId=" + userId +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", interestPoints=" + interestPoints +
                ", tags=" + tags +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", pictures=" + pictures +
                ", videos=" + videos +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
