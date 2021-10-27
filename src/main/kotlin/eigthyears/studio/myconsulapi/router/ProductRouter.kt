package eigthyears.studio.myconsulapi.router

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class ProductRouter {
        @Bean
        fun updateRoutes(productHandler: ProductHandler) = coRouter {
                "/product-matrix".nest {
                        GET("/{productType}", productHandler::getProductMatrix)
                }
                "/cassandra".nest {
                        GET("host", productHandler::getHostCassandra)
                }
        }
}