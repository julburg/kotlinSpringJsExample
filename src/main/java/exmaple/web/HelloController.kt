package exmaple.web

import exmaple.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/test")
    fun helloKotlin(): String {

        return "test"
    }

}

data class HelloDto(val greeting: String)