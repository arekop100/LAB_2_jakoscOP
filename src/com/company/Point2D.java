package com.company;

public class Point2D {

    protected double x=0;
    protected double y=0;

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point2D(double y, double x){
        this.y=y;
        this.x=x;
    }


};





