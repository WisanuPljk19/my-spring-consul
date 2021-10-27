package eigthyears.studio.myconsulapi.router

import eigthyears.studio.myconsulapi.properties.DataProperty
import eigthyears.studio.myconsulapi.properties.ProductMatrixProperty
import eigthyears.studio.myconsulapi.service.ProductMatrixService
import eigthyears.studio.myconsulapi.utils.responseSuccess
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import org.springframework.web.reactive.function.server.json

@Component
class ProductHandler(private val productMatrixService: ProductMatrixService,
                     private val dataProperty: DataProperty) {

    suspend fun getProductMatrix(request: ServerRequest): ServerResponse {
        return ServerResponse
            .ok()
            .json()
            .bodyValueAndAwait(productMatrixService.findProductMatrix(request.pathVariable("productType")))
    }

    suspend fun getHostCassandra(request: ServerRequest): ServerResponse {
        return ServerResponse
            .ok()
            .json()
            .bodyValueAndAwait(dataProperty.host ?: "")
    }
}