package basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        GlobalScope.launch {
            delay(1000L)
            println("World!")
        }

        println("Hello")
        delay(2000L)
    }
}

/**
 * Example03 을 개선한 코드.
 * */
