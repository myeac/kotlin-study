package generics

abstract class Shape {
    abstract fun getArea(size: Int): Double
}

class Square : Shape() {
    override fun getArea(size: Int): Double {
        return (size * size).toDouble()
    }
}

class Circle : Shape() {
    override fun getArea(size: Int): Double = size * size * 3.14
}

class Geometry<T : Shape> {
    fun getMessage(shape: T, size: Int) {
        println("el area de este Shape, es ${shape.getArea(size)}")
    }
}

fun executeShapeGen() {
    val geo1 = Geometry<Square>()
    geo1.getMessage(Square(), 4)
    val geo2 = Geometry<Circle>()
    geo2.getMessage(Circle(), 10)
}