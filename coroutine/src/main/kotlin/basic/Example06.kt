package basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job = GlobalScope.launch {
            delay(1000L)
            println("World!")
        }

        println("Hello")
        job.join()
    }
}

/**
 * runBlocking 은 바로 종료되기 때문에 GlobalScope 코루틴 스코프가 완료되기 전에 프로그램은 종료.
 * GlobalScope 코루틴 스코프가 종료될때까지 기다리게 하기 위해 join() 을 사용한다.
 * 하지만, job 이 여러개일 경우 모두 join() 을 호출해줘야 하는 불편함이 존재한다.
 * */
