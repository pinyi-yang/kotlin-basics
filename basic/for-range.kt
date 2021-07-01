fun main() {
    val x = 10
    val y = 9
    for (i in 1..y+1) {
        print("$i,")
    }
    println()

    val list = listOf("a", "b", "c")
    //* not in the range
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (list.size !in 0..list.lastIndex) {
        println("list size is out of range")
    }

    //step
    for (x in 1..10 step 2) print("$x,")
    println()

    for (x in 9 downTo 0 step 3) print("$x, ")
}