package io.jgoerner.kotlinreference

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class KotlinReferenceApplication

fun main(args: Array<String>) {
	runApplication<KotlinReferenceApplication>(*args)
}
