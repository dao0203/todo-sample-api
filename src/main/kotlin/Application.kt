package org.dao

import io.ktor.http.ContentType
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.netty.EngineMain
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {

    routing {
        get("/") {
            call.respondText("Hello, world!", ContentType.Text.Html)
        }
    }
}
