package com.example.calculatorhw.calculatorMath

interface AbstractStringIterator {
    operator fun hasNext(): Boolean
    operator fun next(): String?
}