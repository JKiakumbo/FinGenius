package jkiakumbo.me.modules

import io.ktor.server.application.*
import io.ktor.server.routing.*
import jkiakumbo.me.routes.partnerRoutes

fun Application.partnerModule(){
    routing {
        // Include the consolidated customer routes
        partnerRoutes()
    }
}