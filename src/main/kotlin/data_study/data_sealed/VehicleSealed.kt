package data_study.data_sealed

abstract class Vehicle

sealed class Car : Vehicle()

sealed class Bicycle : Vehicle()

class BMW : Car()

class Pegasus : Bicycle()

fun getVehicle(): Vehicle = Pegasus()

fun executeVehicleSealed() {
    val myVehicle = getVehicle()
    when (myVehicle) {
        is Car -> println("A car is faster")
        is Bicycle -> println("A bicycle is more healthy")
    }
}