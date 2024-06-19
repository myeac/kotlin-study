package oop.inheritance


open class Job {
    var name = "Generic Job"
    var revenue = 0
    var salary = 10000
    fun work() {
        revenue += salary
        println("$name revenue $revenue")
    }

    fun study() {
        salary += 5000
        println("$name salary $salary")
    }
}

class Engineer : Job() {}
class Doctor : Job() {}

fun startJobObj() {
    val engineer = Engineer()
    val doctor = Doctor()
    engineer.salary = 15000
    doctor.salary = 25000
    engineer.name = "engineer"
    doctor.name = "doctor"

    engineer.work()
    engineer.study()
    engineer.work()

    doctor.study()
    doctor.study()
    doctor.study()
    doctor.study()
    doctor.work()
    doctor.work()
}