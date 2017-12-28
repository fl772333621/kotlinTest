package com.mfanw.kotlin.helloworld

fun main(args: Array<String>) {
	println("..表示范围")
	for (i in 0..9) print(i)
	println()

	println("step表示步长")
	for (i in 0..9 step 2) print(i)
	println()

	println("downTo倒序遍历")
	for (i in 9 downTo 0) print(i)
	println()

	println("until不包含")
	for (i in 0 until 9) print(i)
	println()

	println("listOf可以自动生成一个列表")
	var list = listOf("item1", "item2", "item3")
	for (l in list) println(l)

	println("list.indices表示取到index列表，可以根据list[index]取到数据")
	for (index in list.indices) println("$index --> ${list[index]}")

	println("while循环跟java差不多")
	var startIndex = 0
	while (startIndex++ < 10) print(startIndex)
	println()

	println("when函数跟java的case差不多，但java上用:这里用->")
	var type = 0
	while (type++ < 10) {
		when (type % 4) {
			0 -> println("$type%4=0")
			1 -> println("$type%4=1")
			2 -> println("$type%4=2")
			3 -> println("$type%4=3")
		}
	}

	val fruits = listOf("banana", "avocado", "apple", "kiwi", "awaka")
	fruits.filter { it.startsWith("a") }.sortedBy { it }.map { it.toUpperCase() }.forEach { println(it) }
}