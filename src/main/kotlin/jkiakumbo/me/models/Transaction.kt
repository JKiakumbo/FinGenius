package jkiakumbo.me.models

import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class Transaction(
    val id: String? = null,
    val voucherNo: Int,
    val type: String,
    val date: LocalDateTime,
    val paymentTo: String,
    val receiptFrom: String,
    val amount: Double,
    val reference: String
)

@Serializable
data class TransactionJson(
    val partner: Partner?,
    val transaction: Transaction
)
