package example.myapp.decor

fun makeDecorations() {
    val decoration1 = Decoration("granite", "holy diver")
    println(decoration1)

    val (rocks, diver) = decoration1
    println("rocks: $rocks")
    println("diver: $diver")
}

data class Decoration(val rocks: String, val diver: String)

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
    println("${Color.RED.name}: ${Color.RED.rgb}")
}