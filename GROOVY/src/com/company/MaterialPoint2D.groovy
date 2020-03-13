package com.company;

class MaterialPoint2D extends Point2D{
    final protected double mass;

    MaterialPoint2D(double x, double y, double mass) {
        super(x, y);
        this.mass = mass;
    }

    double getMass() {
        return mass;
    }

    @Override
    String toString() {
        return "x = " + getX() + ",y = " + getY() + ",mass = " + mass;

    }
}