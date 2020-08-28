fun main() {
    val value = 100
    val ranges = 50..75

     when(value){
        in ranges -> println("Normal Score")
        !in ranges -> println("Nice Score")
        else -> println("value undefined")
         }
    }
