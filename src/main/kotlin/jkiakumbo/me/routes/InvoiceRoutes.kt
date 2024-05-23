package jkiakumbo.me.routes

import io.ktor.server.routing.*
import jkiakumbo.me.models.Database
import jkiakumbo.me.models.Invoice
import jkiakumbo.me.models.Partner

fun Route.invoiceRoutes(){
    val database = Database()
    val invoiceCollection = database.db.getCollection<Invoice>("invoices")
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("/invoices"){
        // TODO: Route to add an invoice
        // TODO: Route to get invoice(s)
    }
}