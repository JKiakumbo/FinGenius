package jkiakumbo.me.modules

import io.ktor.server.application.*
import io.ktor.server.routing.*
import jkiakumbo.me.routes.invoiceRoutes

fun Application.invoiceModules(){
    routing {
        // Include the consolidated customer routes
        invoiceRoutes()
    }
}