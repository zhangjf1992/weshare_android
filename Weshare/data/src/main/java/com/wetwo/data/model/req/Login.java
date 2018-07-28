package com.wetwo.data.model.req;

/**
 * Created by FHZ on 2018/7/19.
 */

public class Login {

    /**
     * 警员编号
     */
    private String policeNum;

    /**
     * 密码
     */
    private String password;

    public String getPoliceNum() {
        return policeNum;
    }

    public void setPoliceNum(String policeNum) {
        this.policeNum = policeNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "policeNum='" + policeNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
