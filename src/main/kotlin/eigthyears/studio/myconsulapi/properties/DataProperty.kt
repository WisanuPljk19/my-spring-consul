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
@ConfigurationProperties("cassandra")
class DataProperty{

    var host: String? = null

    @PostConstruct
    fun postConstruct() {
        println("** cassandra.host: $host")
    }
}