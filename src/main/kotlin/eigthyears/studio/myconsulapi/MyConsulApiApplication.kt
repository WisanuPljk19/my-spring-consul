package eigthyears.studio.myconsulapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.bootstrap.config.PropertySourceBootstrapProperties
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableConfigurationProperties
@EnableDiscoveryClient
class MyConsulApiApplication

fun main(args: Array<String>) {
	runApplication<MyConsulApiApplication>(*args)
}
