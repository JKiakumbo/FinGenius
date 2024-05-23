package jkiakumbo.me.models

import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class Invoice(
    val id: String? = null,
    val type: String,
    val invoiceDate: LocalDateTime,
    val dueDate: LocalDateTime,
    val invoiceNo: Int,
    val partnerId: String,
    val creditTerm: String,
    val reference: String,
    val invoiceTotal: Double,
    val invoiceItem: List<InvoiceItem>
)

@Serializable
data class InvoiceItem(
    val productName: String,
    val quantity: Int,
    val rate: Double,
    val valueOfSupplies: Double,
    val salesTax: Double,
    val netAmount: Double
)

@Serializable
data class InvoiceJson(
    val partner: Partner?,
    val invoice: Invoice
)
