package com.company

object Calculations {
    fun positionGeometricCenter(points: Array<Point2D?>): Point2D {
        var temp_x = 0.0
        var temp_y = 0.0

        for (point in points) {
            temp_x += point!!.x
            temp_y += point.y
        }

        return Point2D(temp_x / points.size, temp_y / points.size)

    }

    fun positionCenterOfMass(materialPoint: Array<MaterialPoint2D?>): Point2D {
        var temp_x = 0.0
        var temp_y = 0.0
        var temp_mass = 0.0

        for (point in materialPoint) {
            temp_x += point!!.x * point.mass
            temp_y += point.y * point.mass
            temp_mass += point.mass
        }

        return MaterialPoint2D(temp_x / temp_mass, temp_y / temp_mass, temp_mass)
    }
}