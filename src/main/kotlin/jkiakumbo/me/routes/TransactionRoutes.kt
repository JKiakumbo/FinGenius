package jkiakumbo.me.routes

import io.ktor.server.routing.*
import jkiakumbo.me.models.Database
import jkiakumbo.me.models.Partner
import jkiakumbo.me.models.Transaction

fun Route.transactionRoutes(){
    val database = Database()
    val transactionsCollection = database.db.getCollection<Transaction>("transactions")
    val partnersCollection = database.db.getCollection<Partner>("partners")

    route("transactions"){
        // TODO Route add transaction
        // TODO Route edit transaction
        // TODO Route get transaction
    }
}