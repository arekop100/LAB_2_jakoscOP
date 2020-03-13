package com.company;

public class MaterialPoint2D extends Point2D {

    private double mass = 0;

    @Override
    public String toString() {
        return "MaterialPoint2D{" +
                "x=" + x +
                ", y=" + y +
                ", mass=" + mass +
                '}';
    }

    public double getMass() {
        return mass;
    }

    public MaterialPoint2D (double x, double y, double mass){
        super(x,y);
        this.mass=mass;

    }
}

