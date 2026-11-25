package com.niitlab.assignments

fun main(){
    val pNames = mutableListOf<String>()
    val quantities = mutableListOf<Int>()
    val prices = mutableListOf<Double>()

//    Number of Products
    var num: Int

    while(true){
        print("Hello, Enter the number of products: ")
        val input = readln().toIntOrNull()

        if (input != null && input in 1..100){
            num = input
            break
        }
        println("Invalid input. Enter a number between 1-100: ")

    }

//    Processing
    for (i in 0 until num){

        println("\nEnter details for Product ${i + 1}" )

        // Product Name
        var name: String

        while (true){
            print("Product Name")
        }
    }
}