package jkiakumbo.me.routes

import io.ktor.server.routing.*
import jkiakumbo.me.models.Database
import jkiakumbo.me.models.Invoice
import jkiakumbo.me.models.Partner
import jkiakumbo.me.models.Transaction

fun Route.ledgerRoutes(){
    val database = Database()
    val invoiceCollection = database.db.getCollection<Invoice>("invoices")
    val transactionCollection = database.db.getCollection<Transaction>("transactions")
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("ledger"){
        // TODO: Route to get ledger items
    }
}