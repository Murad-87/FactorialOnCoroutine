package com.example.factorialtestcoroutine

sealed class State

object Error : State()
object Progress : State()
class Factorial(val value: String) : State()