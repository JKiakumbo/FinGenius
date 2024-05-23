package jkiakumbo.me.modules

import io.ktor.server.application.*
import io.ktor.server.routing.*
import jkiakumbo.me.routes.transactionRoutes

fun Application.transctionsModule(){
    routing {
        // Include the consolidated customer routes
        transactionRoutes()
    }
}