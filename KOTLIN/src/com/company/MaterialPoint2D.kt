package com.company

class MaterialPoint2D(x: Double, y: Double, val mass: Double) : Point2D(x, y) {

    override fun toString(): String {
        return "x = $x,y = $y,mass = $mass"

    }
}