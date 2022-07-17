package basic

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        repeat(5) { i -> println("Coroutine A, $i") }
    }

    launch {
        repeat(5) { i -> println("Coroutine B, $i") }
    }

    println("Coroutine Outer")
}

/**
 * suspend and resume
 * 첫 번째 launch 수행 완료 후 두 번째 launch 수행
 * */
