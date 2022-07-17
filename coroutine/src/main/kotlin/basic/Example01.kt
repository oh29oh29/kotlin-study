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
}

/**
 * 메인 쓰레드가 종료되면 코루틴 스코프 완료 여부와 상관 없이 프로그램은 종료.
 * 따라서 위 예제에서는 콘솔에 Hello 만 찍히게 된다.
 * */
