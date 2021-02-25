package com.snippet.test.model;

public class BaseData {

    private int cBaseValue;
    private final long id;

    public int getcBaseValue() {
        return cBaseValue;
    }

    public void setcBaseValue(int cBaseValue) {
        this.cBaseValue = cBaseValue;
    }

    public long getId() {
        return id;
    }

    public BaseData(int cBaseValue, long id) {
        this.cBaseValue = cBaseValue;
        this.id = id;
    }

}