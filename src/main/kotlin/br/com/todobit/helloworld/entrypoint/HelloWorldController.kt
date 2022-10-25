package br.com.todobit.helloworld.entrypoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.ZonedDateTime

@RestController
class HelloWorldController(val initDate: ZonedDateTime = ZonedDateTime.now()) {

    @GetMapping("/")
    fun hello(): String {
        return "hello world $initDate"
    }
}
