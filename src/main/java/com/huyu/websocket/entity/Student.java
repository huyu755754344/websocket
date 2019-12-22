package com.huyu.websocket.entity;

public class Student {
    private String sName;
    private String sId;
    private String sBirth;
    private String sSex;
    private Score score;

    public String getsBirth() {
        return sBirth;
    }

    public String getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsBirth(String sBirth) {
        this.sBirth = sBirth;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
