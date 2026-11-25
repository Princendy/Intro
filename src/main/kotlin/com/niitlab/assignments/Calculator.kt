package com.niitlab.assignments

class Calculator(val a: Double, val b: Double, val op: String) {
    init {
        require(a > 0.0 && b > 0.0) {"Enter a number greater than zero (0)"}
    }
    init {
        require(op in listOf("+","-","*","/","%","*")) {"Invalid Operator"}
    }



    fun calc(): Double = when(op){
        "+" -> add(a, b)
        "-" -> sub(a, b)
        "*" -> multiply(a, b)
        "%" -> mod(a, b)
        else -> divide(a, b)

    }

    fun add( a: Double, b: Double): Double {
        return a + b
    }

    fun sub(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        return a / b
    }

    fun mod(a: Double, b: Double): Double {
        return a % b
    }

}