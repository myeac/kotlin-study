package classestypes.init

class WebBrowserInit(
) {

    init {
        println("conectando el navegador")
        println("https://google.com")
    }

}

fun callWebBrowserInit() {
    val browser = WebBrowserInit()
}