package oop.polimorfism

class Television() {
    fun getChannel(id: String) {
        println("regular boradcast for channel $id")
    }

    fun getChannel(id: String, subtitles: Boolean) {
        println("regular broadcast for channel $id")
        if (subtitles)
            println("with subtitles")
        else
            println("without subtitles")
    }

    fun getChannel(id: String, time: String) {
        println("broadcast for channel $id at $time time")
    }
}

fun executeTelevision() {
    val television = Television()
    television.getChannel("3")
    television.getChannel("5", true)
    television.getChannel("8", "13h00")
}