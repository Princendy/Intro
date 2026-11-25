package com.niitlab.intro

import com.niitlab.compute.*
import com.niitlab.collections.listz
import com.niitlab.intro.*

fun main(){

    println("\nWelcome To Kotlin\n")

    val tes = Tesla()
    val cyberTruck = Truck()

    tes.startEngine()
    tes.fuelUp()
    tes.stopEngine()

    cyberTruck.drive()
    cyberTruck.park()
    cyberTruck.insure()

//    val dog = Animal()
//    dog.name = "Bingo"
//    dog.animal = "Dog"
//    dog.sound = "Barks"
//    dog.gender = "Male"
//    dog.food = "Bones and Meat"
//    dog.movement = "Runs"
//    dog.origin = "Nigeria"
//
//    dog.showAnimal()

//    val carOne = Car(name = "David")
//    val carTwo = Car(name = "Prince")
//
//    carOne.brand = "Mercedez Benz"
//    carOne.speed = 350.0
//    carOne.drive()
//
//    carTwo.brand = "Ferrari"
//    carTwo.speed = 450.0
//    carTwo.drive()
//
//    val sumOne = Calc()
//    val sumTwo = Calc(100)
//    val sumThree = Calc(100, 200)
//
//    println("""
//        Sum One = ${sumOne.add()}
//        Sum Two = ${sumTwo.add()}
//        Sum Three = ${sumThree.add()}
//    """.trimIndent())




//
//    val word = "MARY"
//    println("Initial word: $word")
//
//    val final = word.lowercase()
//    println("After conversion: $final")

//    val firstName = "Prince"
//    val lastName = "David"
//    val course = "Software Engineering"
//    val android  = 89
//    val html = 90
//    val sql = 96

//
//    println("Welcome $firstName $lastName, you aree enrolled for $course")
//    println("Your overall grade is: ${android + sql + html}")


//    val email = """
//        Dear Sir,
//
//        Application for Internship
//
//        I am writing.....
//    """.trimIndent()



//    val sum = addition(20,10)
//    val difference = subtraction(20,10)
//    val product = multiplication(20, 10)
//    val quotient = division(20.0,10.0)
//    val remainder = modularity(20.0,10.0)

//    println("""
//        sum: $sum
//        difference: $difference
//        product: $product
//        quotient: $quotient
//        remainder: $remainder
//    """.trimIndent())

//    var a: String? = null
//    var b: Int? = 30
//    var c: Int? = 20
//
//    var res = a + b + c
//    print(res)

}



//
////    print("Enter your First Name: ")
////    val firstName = readln()
////    print("Enter your Last Name: ")
////    val lastName = readln()
////    print("Enter your Course: ")
////    var course = readln()
////
//////    val is immutable
//////    var is mutable
////
////    print("Welcome to Kotlin")
////    user(firstName, lastName)
////    user(firstName, lastName, course)
////
////    print("Enter the value of a: ")
////    val a = readln().toInt()
////    print("Enter the value of b: ")
////    val b = readln().toInt()
////
////    val sum = compute(a,b)
////
////    val greatest = greaterThan(37, 47, 88)
////
////    println(sum)
////    println(greatest)
////    println(grade('C'))
////
////
////
////}
////
////fun user(fName: String, lastName: String, course: String = "Java"){
////    println("Hello, $fName $lastName! You are studying $course")
////}
////
////fun compute(a: Int, b: Int) = a + b
////
////fun greaterThan(a: Int, b: Int, c: Int): String{
////    return if (a > b && b > c){
////        "$a is greater than $b and $c"
////    }
////    else if(b > c){
////        "$b is greater than $a and $c"
////    }
////    else{
////        "$c is greater than $a and $b"
////    }
////}
////
////fun grade(grade: Char): String{
////    val result = when (grade){
////        'A' -> "Excellent"
////        'B' -> "Good"
////        'C' -> "Average"
////        else -> "Fail"
////    }
////
////    return result
////}
