package basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }

    println("Hello")
    runBlocking {
        delay(2000L)
    }
}

/**
 * runBlocking 은 자신을 호출한 쓰레드를 blocking
 * */
