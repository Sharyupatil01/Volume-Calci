package com.example.volumecalculator;

public class shape {
    int shapeImg;
    String shapename;

    public shape(int shapeImg, String shapename) {
        this.shapeImg = shapeImg;
        this.shapename = shapename;
    }

    public int getShapeImg() {
        return shapeImg;
    }

    public void setShapeImg(int shapeImg) {
        this.shapeImg = shapeImg;
    }

    public String getShapename() {
        return shapename;
    }

    public void setShapename(String shapename) {
        this.shapename = shapename;
    }
}
