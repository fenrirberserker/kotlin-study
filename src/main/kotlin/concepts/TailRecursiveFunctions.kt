package concepts

import java.math.BigInteger

fun main() {

    println( fib(10000, BigInteger("1"),BigInteger("0")))

}

//to avoid stack overflow
//tailrec converts recursive calls
//into an internal loop
tailrec fun fib(n: Int, a: BigInteger, b: BigInteger):BigInteger{
    return if (n==0) b else fib(n-1, a+b,a)
}