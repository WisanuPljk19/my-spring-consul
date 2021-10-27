package eigthyears.studio.myconsulapi.utils

import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import org.springframework.web.reactive.function.server.json

suspend inline fun responseSuccess(response: Any) =
    ServerResponse
        .ok()
        .json()
        .bodyValueAndAwait(response)