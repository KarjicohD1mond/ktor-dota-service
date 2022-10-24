package com.mdota

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.mdota.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureHTTP()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
