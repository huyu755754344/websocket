package com.huyu.websocket.pojo;

public class Message {
    public String name;
    public String message;
    public String toName;

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getToName() {
        return toName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    @Override
    public String toString() {
        return name+toName+message;
    }
}
