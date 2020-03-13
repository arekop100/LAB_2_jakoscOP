package com.company;

class Point2D {
    final protected double x=0,y=0;

    Point2D(double x,double y){
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    @Override
    String toString() {
        return "x = " + x + ",y = " + y;
    }
}