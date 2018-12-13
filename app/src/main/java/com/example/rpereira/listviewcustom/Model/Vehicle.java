package com.example.rpereira.listviewcustom.Model;

public class Vehicle {

    private int mId;
    private String mBrand;
    private String mModel;
    private boolean mChecked;

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }

    public void setmChecked(boolean mChecked) {
        this.mChecked = mChecked;
    }

    public int getId() {
        return this.mId;
    }

    public String getBrand() {
        return this.mBrand;
    }

    public String getModel() {
        return this.mModel;
    }

    public boolean isChecked() { return this.mChecked; }

}

