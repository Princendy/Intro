package com.niitlab.assignments

fun main(){
    print("Welcome, Enter num 1: ")
    val num1 = readln().toInt()

    print("Enter num 2: ")
    val num2 = readln().toInt()

    print("Enter num 3: ")
    val num3 = readln().toInt()

    print("Enter num 4: ")
    val num4 = readln().toInt()

    print("Enter num 5: ")
    val num5 = readln().toInt()

    val nums = listOf(num1, num2, num3, num4, num5)


    val sum = nums.sum()
    val avg = nums.average()

    println("Sum of $nums = $sum")
    println("Average of $nums = $avg")
}
