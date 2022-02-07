// higher-order function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun main(args: Array<String>) {
    // lambda
    val decreaseDirty: (Int) -> Int = { dirty -> dirty - 1}

    // named function
    fun increaseDirty( start: Int ) = start + 1

    // calling higher-order function with lambda
    println(updateDirty(15, decreaseDirty))

    // calling higher-order function with named function (need to obtain function reference!)
    println(updateDirty(15, ::increaseDirty))
}