package com.company

fun main(args: Array<String>) {
    val POINTS = 2
    val points = arrayOfNulls<Point2D>(POINTS)
    val materialPoints = arrayOfNulls<MaterialPoint2D>(POINTS)

    points[0] = Point2D(0.0, 0.0)
    points[1] = Point2D(10.0, 10.0)

    materialPoints[0] = MaterialPoint2D(0.0, 0.0, 10.0)
    materialPoints[1] = MaterialPoint2D(10.0, 10.0, 100.0)

    val geometricCenter = Calculations.positionGeometricCenter(points)
    val massCenter = Calculations.positionCenterOfMass(materialPoints)

    println("Polozenie srodka masy: $massCenter")
    println("Polozenie srodka geometrycznego: $geometricCenter")
}