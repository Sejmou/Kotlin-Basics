package example.myapp.decor

fun makeDecorations() {
    val decoration1 = Decoration("granite", "holy diver")
    println(decoration1)

    val (rocks, diver) = decoration1
    println("rocks: $rocks")
    println("diver: $diver")
}

data class Decoration(val rocks: String, val diver: String)

fun main() {
    makeDecorations()
}