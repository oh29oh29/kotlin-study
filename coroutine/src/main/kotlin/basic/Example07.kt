package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            delay(1000L)
            println("World!")
        }

        println("Hello")
    }
}

/**
 * Structured concurrency.
 * Example06 을 개선한 코드.
 * */
