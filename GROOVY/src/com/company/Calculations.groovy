package com.company;

class Calculations {
    static Point2D positionGeometricCenter(Point2D[] points){
        double temp_x = 0, temp_y = 0;

        for(Point2D point : points){
            temp_x += point.getX();
            temp_y += point.getY();
        }

        return new Point2D(temp_x / points.length, temp_y / points.length);

    }

    static Point2D positionCenterOfMass(MaterialPoint2D[] materialPoint){
        double temp_x = 0, temp_y = 0, temp_mass = 0;

        for(MaterialPoint2D point: materialPoint){
            temp_x += point.getX() * point.getMass();
            temp_y += point.getY() * point.getMass();
            temp_mass += point.getMass();
        }

        return new MaterialPoint2D(temp_x/temp_mass,temp_y/temp_mass,temp_mass);
    }
}