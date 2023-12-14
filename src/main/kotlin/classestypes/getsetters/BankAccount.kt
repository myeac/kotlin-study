package classestypes.getsetters

class BankAccount {
    var creditRating = 500
    var account: Int = 0
        get() = field
        set(value) {
            if (value > account)
                creditRating++
            else
                creditRating--
            field = value
            println("nueva linea de credito es: $creditRating")
        }
}

fun callBAckAccount() {
    val account = BankAccount()
    account.account = 300
    account.account = 400
    account.account = 100
}