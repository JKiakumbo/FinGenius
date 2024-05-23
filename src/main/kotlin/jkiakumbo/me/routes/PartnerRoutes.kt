package jkiakumbo.me.routes

import io.ktor.server.routing.*
import jkiakumbo.me.models.Database
import jkiakumbo.me.models.Partner

fun Route.partnerRoutes(){
    val database = Database()
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("/partners"){
        // TODO: Route to add a partner

        // TODO: Route to edit a partner

        // TODO: Route to get a partner
    }
}