package interfaces

fun initializePet() {
    val child = Child()
    child.raisePet()
}

interface Pet {
    var currentLevel: Int
    fun startPlaying()
    fun feed()
}

class Puppy : Pet {
    override var currentLevel: Int = 100

    override fun startPlaying() {
        println("dogs play by running jumping and barking")
    }

    override fun feed() {
        println("Give doggy treats")
    }
}

class Child {
    val pet: Pet

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        for (i in 1..pet.currentLevel) {
            pet.startPlaying()
        }
        pet.feed()
    }
}

class PetStore {
    fun getPet(): Pet {
        return Puppy()
    }
}
