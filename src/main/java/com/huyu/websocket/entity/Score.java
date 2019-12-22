package com.huyu.websocket.entity;

public class Score {
    private String sId;
    private String cId;
    private int sScore;

    public String getsId() {
        return sId;
    }

    public int getsScore() {
        return sScore;
    }

    public String getcId() {
        return cId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public void setsScore(int sScore) {
        this.sScore = sScore;
    }
}
