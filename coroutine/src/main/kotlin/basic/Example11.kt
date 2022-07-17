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
        repeat(5) { i -> println("Coroutine B, $i") }
    }

    println("Coroutine Outer")
}

fun <T> println(msg: T) {
    kotlin.io.println("$msg [${Thread.currentThread().name}]")
}

/**
 * suspend and resume
 * 첫 번째 코루틴에서 suspend 걸려서 다음 코루틴이 실행
 * 두 번째 코루틴에는 suspend 가 없으니 수행 완료 후 남은 코루틴 수행
 *
 * Edit Configurations
 * - VM options -Dkotlinx.coroutines.debug
 * */
