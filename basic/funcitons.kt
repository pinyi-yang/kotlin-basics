//* 

//* return type can be inferred

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun main() {
    print(sum(1, 5))
    print(sum1(3, 6))
}
