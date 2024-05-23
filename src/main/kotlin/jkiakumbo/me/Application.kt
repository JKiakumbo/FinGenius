package jkiakumbo.me

import io.ktor.server.application.*
import jkiakumbo.me.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}
