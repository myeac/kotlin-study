package classestypes.companionobj

class CourseCompanion {

    fun getCourseInfo(){
        println("kotlin es un lenguaje basado en java")
    }

    companion object{
        fun getCourseMetaInfo(){
            println("kotlin no es un lenguaje dificil para aprender")
        }
    }

}