package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            printWorld()
        }

        println("Hello")
    }
}

suspend fun printWorld() {
    delay(1000L)
    println("World!")
}

/**
 * Extract function refactoring.
 * launch() 내 동작을 별도 함수로 추출.
 * 이때, suspend 를 붙여줘야 한다.
 * */
