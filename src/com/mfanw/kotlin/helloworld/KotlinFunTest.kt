package com.mfanw.kotlin.helloworld

fun sum1(a: Int, b: Int): Int {
	return a + b
}

fun main(args: Array<String>) {

	println(sum1(3, 2))

	fun sum2(a: Int, b: Int) = a + b
	println(sum2(4, 6))

	var sum3: (Int, Int) -> Int = { a, b -> a + b }
	println(sum3(5, 8))

}