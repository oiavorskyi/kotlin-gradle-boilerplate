package jugglinhats.boilerplate

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BoilerplateApplication

fun main(args: Array<String>) {
    SpringApplication.run(BoilerplateApplication::class.java, *args)
}
