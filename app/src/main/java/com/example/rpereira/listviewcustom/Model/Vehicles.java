package com.example.rpereira.listviewcustom.Model;

public class Vehicles {

    private int mId;
    private String mBrand;
    private String mModel;

    public Vehicles(int id, String brand, String model) {
        this.mId = id;
        this.mBrand = brand;
        this.mModel = model;
    }

    public static class Builder {
        private int id;
        private String brand;
        private String model;

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

        public Vehicles build() {
            return new Vehicles(id, brand, model);
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

}
