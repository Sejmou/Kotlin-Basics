fun main(args: Array<String>) {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager filter: $eager")

    // lazy, will wait until asked to evaluate
    val lazy = decorations.asSequence().filter { it[0] == 'p' }
    println("lazy filter (filtering Sequence): $lazy")

    // force evaluation of the lazy list
    val newList = lazy.toList()
    println("evaluated lazy-filtered list: $newList")
}