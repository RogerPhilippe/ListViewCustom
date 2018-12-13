package com.example.rpereira.listviewcustom.Model;

public class Vehicles {

    private int mId;
    private String mBrand;
    private String mModel;
    private boolean mChecked;

    public Vehicles(int id, String brand, String model, boolean checked) {
        this.mId = id;
        this.mBrand = brand;
        this.mModel = model;
        this.mChecked = checked;
    }

    public static class Builder {
        private int id;
        private String brand;
        private String model;
        private boolean checked;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setChecked(boolean checked) {
            this.checked = checked;
            return this;
        }

        public Vehicles build() {
            return new Vehicles(id, brand, model, checked);
        }

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
