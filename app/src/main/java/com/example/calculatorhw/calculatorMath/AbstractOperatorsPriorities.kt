package com.example.calculatorhw.calculatorMath

interface AbstractOperatorsPriorities {

    fun getPriority(operator: String?): Int?

    fun addOperator(operator: String?, priority: Int)

    fun deleteOperator(operator: String?)
}