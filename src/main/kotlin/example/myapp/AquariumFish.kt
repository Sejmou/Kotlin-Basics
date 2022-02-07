package example.myapp

abstract class AquariumFish: FishAction {
    abstract val color: String
}

class Shark: AquariumFish() {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish() {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}

interface FishAction {
    fun eat()
}