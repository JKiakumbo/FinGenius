package jkiakumbo.me.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import jkiakumbo.me.models.Database
import jkiakumbo.me.models.Partner
import org.litote.kmongo.coroutine.insertOne

fun Route.partnerRoutes(){
    val database = Database()
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("/partners"){
        post {
            try {
                val partner = call.receive<Partner>()
                val insertResult = partnersCollection.insertOne(partner)

                if (insertResult.wasAcknowledged()){
                    call.respond(HttpStatusCode.Created, "${partner.type.replaceFirstChar { it.uppercase() }} " +
                            "added successfully: ${partner.firstName} ${partner.lastName}.")
                } else {
                    call.respond(HttpStatusCode.InternalServerError, "Failed to add ${partner.type}")
                }
            } catch (e: ContentTransformationException) {
                call.respond(HttpStatusCode.BadRequest, "Invalid input data format.")
            }
        }

        // TODO: Route to edit a partner

        // TODO: Route to get a partner
    }
}