package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        repeat(5) { i ->
            println("Coroutine A, $i")
            delay(10L)
        }
    }

    launch {
        repeat(5) { i ->
            println("Coroutine B, $i")
            delay(10L)
        }
    }

    println("Coroutine Outer")
}

/**
 * suspend and resume
 * 첫 번째 코루틴에서 suspend 걸려서 다음 코루틴이 수행
 * 두 번째 코루틴에도 suspend 걸려서 다음 코루틴 수행
 * 첫 번째 코루틴과 두 번째 코루틴이 번갈아가면서 수행
 *
 * Edit Configurations
 * - VM options -Dkotlinx.coroutines.debug
 * */
