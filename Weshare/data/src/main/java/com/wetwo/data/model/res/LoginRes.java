package com.wetwo.data.model.res;

/**
 * Created by FHZ on 2018/7/19.
 */

public class LoginRes extends Response{
    /**
     * 令牌
     */
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginRes{" +
                "responseCode=" + responseCode +
                ", token='" + token + '\'' +
                ", description=" + description +
                '}';
    }
}
