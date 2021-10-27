package eigthyears.studio.myconsulapi.properties

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@RefreshScope
@ConstructorBinding
@ConfigurationProperties("matrix")
class ProductMatrixProperty{
    data class MatrixResult(
        val productType: String,
        val dopa: Boolean?,
        val compareFace: Boolean?,
        val customerInfo: Boolean?,
        val legalAddress: Boolean?,
        val mailingAddress: Boolean?,
        val officeAddress: Boolean?,
        val fatca: Boolean?,
        val cdd: Boolean?,
        val politicalStatus: Boolean?,
        val dipchip: Boolean?,
        val aml: Boolean?,
        val kycScore: Boolean?,
        val bankruptcy: Boolean?,
        val fatcaLevel: Boolean?,
        val riskAssessment: Boolean?,
        val fraud: Boolean?,
        val whitelist: Boolean?,
        val ocr: Boolean?,
        val bankruptcyAccountblock: Boolean?,
        val bankruptcyReceivership: Boolean?
    )

    var results: List<MatrixResult>? = null

    @PostConstruct
    fun postConstruct() {
        println("** results: $results")
    }
}