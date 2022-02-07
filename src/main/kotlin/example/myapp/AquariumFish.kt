package example.myapp

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

// this is a class instead of an object, as we need a constructor
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}