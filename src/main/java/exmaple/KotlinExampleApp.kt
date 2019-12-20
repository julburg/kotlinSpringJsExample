package exmaple

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author  Julia Burgard - burgard@synyx.de
 */
@SpringBootApplication
class KotlinDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinDemoApplication::class.java, *args)
}