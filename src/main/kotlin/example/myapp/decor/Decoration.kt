package example.myapp.decor

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
    println(decoration3 == decoration2)
    println(decoration3 === decoration2)
}

data class Decoration(val rocks: String) {

}

fun main() {
    makeDecorations()
}