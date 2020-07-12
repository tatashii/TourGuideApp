package com.example.myapplication;

public class ModelClass {

    private int image;
    private String tv1;
    private String tv2;

    public ModelClass(int image,String tv1,String tv2){
        this.image=image;
        this.tv1=tv1;
        this.tv2=tv2;
    }

    @Override
    public String toString() {
        return "ModelClass{" +
                "image=" + image +
                ", tv1='" + tv1 + '\'' +
                ", tv2='" + tv2 + '\'' +
                '}';
    }

    public int getImage() {
        return image;
    }

    public String getTv1() {
        return tv1;
    }

    public String getTv2() {
        return tv2;
    }
}
