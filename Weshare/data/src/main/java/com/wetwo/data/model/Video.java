package com.wetwo.data.model;

public class Video {
    private int id;
    private int informationId;
    private String url;
    private String position;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInformationId() {
        return informationId;
    }

    public void setInformationId(int informationId) {
        this.informationId = informationId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", informationId=" + informationId +
                ", url='" + url + '\'' +
                ", position='" + position + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
