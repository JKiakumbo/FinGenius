package jkiakumbo.me.routes

import io.ktor.server.routing.*
import jkiakumbo.me.models.Database
import jkiakumbo.me.models.Product

fun Route.ProductRoutes(){
    val database = Database()
    val productsCollection = database.db.getCollection<Product>("products")

    route("/products"){
        // TODO: Route to add product
        // TODO: Route to edit product
        // TODO: Route to get product
    }
}