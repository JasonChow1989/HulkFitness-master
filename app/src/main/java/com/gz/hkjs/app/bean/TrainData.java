package com.gz.hkjs.app.bean;

/**
 * Created by Administrator on 2017/4/18.
 */

public class TrainData {

    //拜访日期
    private String date;
    //拜访数量
    private int data;

    public TrainData(String date, int data) {
        this.date = date;
        this.data = data;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
