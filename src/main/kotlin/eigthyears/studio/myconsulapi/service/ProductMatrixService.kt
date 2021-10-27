package eigthyears.studio.myconsulapi.service

import eigthyears.studio.myconsulapi.properties.ProductMatrixProperty
import org.springframework.stereotype.Service

@Service
class ProductMatrixService(private val productMatrixProperty: ProductMatrixProperty) {

    suspend fun findProductMatrix(productType: String): ProductMatrixProperty.MatrixResult {
     return productMatrixProperty.results?.find {
            it.productType.equals(productType, true)
        } ?: throw IllegalArgumentException("Product type: $productType not found.")
    }

}