package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    // Dimensions in cm
    var width: Int = length
    var height: Int = width
    var length: Int = height

    fun printSize() {
        println("Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm ")
    }
}