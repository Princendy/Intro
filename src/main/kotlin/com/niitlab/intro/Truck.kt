package com.niitlab.intro

class Truck : Drivable, Insured {

    override fun drive() {
        println("Drive the Truck")
    }

    override fun park() {
        println("Park the truck")
    }

}