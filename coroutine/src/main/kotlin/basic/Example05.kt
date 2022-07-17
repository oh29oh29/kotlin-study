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
    }
}

/**
 * runBlocking 은 바로 종료되기 때문에 GlobalScope 코루틴 스코프가 완료되기 전에 프로그램은 종료.
 * 따라서 콘솔에 Hello 만 찍히게 된다.
 * */
