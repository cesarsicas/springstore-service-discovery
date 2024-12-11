package br.com.cesarsicas.springstore_service_discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringstoreServiceDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<SpringstoreServiceDiscoveryApplication>(*args)
}
