package com.niitlab.intro

import com.niitlab.compute.*

class Car(var name: String) {
    var brand = ""
    var speed = 0.0

    fun drive(){
        println("You are driving $brand at $speed km/h")
    }
}

class Calc(var a: Int, var b: Int){

    constructor(a:Int) : this(a,10)

    constructor(): this(30, 20)

    fun add() = a + b
}

class Addition : Compute(){
    val add = addition(8,9)

    fun display(){
        println("$add is displayed")
    }
}