package com.niitlab.intro

class Animal {
    var name = ""
    var animal = ""
    var gender = ""
    var sound = ""
    var movement = ""
    var origin = ""
    var food = ""

    fun showAnimal(){
        println("""
            $name is a/an $animal
            $name is found in $origin
            $name $sound
            $name is a $gender
            $name $movement and eats $food
            
        """.trimIndent())
    }
}