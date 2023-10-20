package classesstructure

class OnlineStore {

    constructor() {
        userName = "testUserName"
        balance = 20
    }

    constructor(paramUSer: String) {
        userName = paramUSer
        balance = 80
    }

    constructor(paramUSer: String, paramBalance: Int) {
        userName = paramUSer
        balance = paramBalance
    }

    var userName = "default"
    var balance = 0
    val shirtValue = 20

    fun canPurchase() {
        if (balance >= shirtValue) {
            when (val howMuch = (balance / shirtValue)) {
                1 -> { println("el usuario $userName puede comprar solo $howMuch camisa") }
                else -> { println("el usuario $userName puede comprar $howMuch camisas") }
            }
        }
    }

}

fun executeOnlinteStore() {
    val storeBasic = OnlineStore()
    val storeWithName = OnlineStore("tienda Loca")
    val storeOnline = OnlineStore("tienda mascotas", 120)

    storeBasic.canPurchase()
    storeWithName.canPurchase()
    storeOnline.canPurchase()

}