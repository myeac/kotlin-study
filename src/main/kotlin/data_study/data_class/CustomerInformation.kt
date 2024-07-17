package data_study.data_class

data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int,
)

fun executeCustomerData() {
    val customers = arrayListOf<Customer>()
    customers.add(Customer("alice", "alice@email.com", 7))
    customers.add(Customer("jhon", "jhon@email.com", 5))
    customers.add(Customer("carol", "carol@email.com", 9))

    val newCustomer = customers[1].copy(email = "jhonNewEmail@email.com")
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)
}

private fun sendEmail(customers: ArrayList<Customer>) {
    customers.forEach {
        println("sending an email to ${it.email}")
    }
}