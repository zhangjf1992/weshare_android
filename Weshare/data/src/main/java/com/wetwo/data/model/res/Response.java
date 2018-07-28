package com.wetwo.data.model.res;

/**
 * Created by FHZ on 2018/7/19.
 */

public class Response {

    /**
     * 操作是否成功，200：成功；
     */
    protected int responseCode;

    /**
     * 结果描述
     */
    protected String description;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
