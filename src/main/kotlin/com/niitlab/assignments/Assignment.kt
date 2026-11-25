package com.niitlab.assignments

fun main(){
    print("Enter your name: ")
    val name = readln()
    print("Enter your score for Python: ")
    val python = readln().toFloat()
    print("Enter your score for Java: ")
    val java = readln().toFloat()
    print("Enter your score for HTML: ")
    val html = readln().toFloat()

    println("----------")

    val avg = average(python, java, html)
    val grd = grade(avg)

    println("Student: $name")
    println("Average: " + (String.format("%.2f", avg)))
    println("Grade: $grd")

    println("----------")
}

fun average(python: Float, java: Float, html: Float) = (python + java + html) / 3

fun grade(average: Float): String{
    return  if(average >= 90 && average <= 100){
        "A"
    }
    else if(average >= 75 && average < 90){
        "B"
    }
    else if(average >= 50 && average < 75){
        "C"
    }
    else if(average >= 0 && average < 50){
        "F"
    }
    else{
        "Invalid Scores"
    }
}