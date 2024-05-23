package jkiakumbo.me.models

import kotlinx.serialization.Serializable

@Serializable
data class Transaction(
    val dummy: Int = 0
)

@Serializable
data class TransactionJson(
    val dummy: Int = 0
)
