package classestypes.getsetters

class BankUserAccount {

    var interestRate = 0.0
    var amount: Int = 0
        get() = field
        set(value) {
            if (value < 1000)
                interestRate = 1.0
            else if (value < 10000)
                interestRate = 0.5
            else
                interestRate = 0.2
            field = value
            println("el cliente tiene un valor de $value y tiene un ratio de intereses de $interestRate")
        }

}

fun callBankUserAccount() {
    val account = BankUserAccount()
    account.amount = 500
    account.amount = 1000
    account.amount = 1200
    account.amount = 10000
    account.amount = 20000
}