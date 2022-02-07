package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000}l")
    }

    constructor(numberOfFish: Int) : this() {
        println("original size:")
        printSize()

        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
        println("new height (to accommodate $numberOfFish fish): $height cm")
    }

    fun printSize() {
        println("Width: $width cm " +
            "Length: $length cm " +
            "Height: $height cm ")
    }
}