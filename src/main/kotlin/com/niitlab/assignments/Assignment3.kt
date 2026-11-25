package com.niitlab.assignments

/**
 * Create a calculator class that has multiple functions for different operations
 * The class takes three properties num1, num2, and operator
 * Add the init constructor to require that users can't enter a value < or = 0
 * Using a control statement like if or when, call a function based on the operator entered
 * EXAMPLE: num1 = 6, num2 = 9, operator: +, then the addition function is called
 * Display the result of the operation selected
 */

fun main(){

    println("\n=====You are now using Endy's calculator=====")

    print("Enter a number above 0: ")
    val a = readln().toDouble()

    print("Enter another number above 0: ")
    val b = readln().toDouble()

    print("Enter an operator (e.g. +,-,/,%,*): ")
    val op = readln()

    val cal = Calculator(a, b, op)
    println("$a $op $b = ${"%.2f".format((cal.calc()))}")
}