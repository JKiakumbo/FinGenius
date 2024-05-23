package jkiakumbo.me.modules

import io.ktor.server.application.*
import io.ktor.server.routing.*
import jkiakumbo.me.routes.ledgerRoutes

fun Application.ledgerModule(){
    routing {
        // Include the consolidated customer routes
        ledgerRoutes()
    }
}