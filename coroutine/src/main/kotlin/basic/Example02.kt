package basic

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }

    println("Hello")
    Thread.sleep(2000L)
}

/**
 * 메인 쓰레드가 종료되면 코루틴 스코프 완료 여부와 상관 없이 프로그램은 종료.
 * 따라서 메인 쓰레드에 sleep 을 걸어서 기다려주면 World! 까지 콘솔에 찍히게 되는 것을 확인 할 수 있다.
 * */
