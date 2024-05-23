package jkiakumbo.me.models

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: String? = null,
    val name: String,
    val coreCompany: String,
    val rate: Double,
    val status: String,
    val taxExempted: Double,
    val salesTax: Double,
    val notes: String
)
