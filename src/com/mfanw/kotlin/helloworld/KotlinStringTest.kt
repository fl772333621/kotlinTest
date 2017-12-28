package com.mfanw.kotlin.helloworld

fun main(args: Array<String>) {
	println("使用字符串模版，模版中的\$可以用来指定字段")
	var age = 29
	var name = "小明"
	var template = "姓名=$name, 年龄=$age"
	println(template)
}