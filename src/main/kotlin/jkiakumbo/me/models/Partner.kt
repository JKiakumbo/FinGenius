package jkiakumbo.me.models

import kotlinx.serialization.Serializable

@Serializable
data class Partner (
    val id: String? = null,
    val type: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val status: String,
    val contactNumber: String,
    val openingBalance: Double,
    val address: String,
    val repName: String,
    val repContact: String,
    val repDescription: String
)
