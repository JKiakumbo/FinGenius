package jkiakumbo.me.models

import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
data class LedgerItem(
    val date: LocalDateTime,
    val instrumentNo: Int,
    val reference: String,
    val description: String,
    val quantity: Int,
    val debit: Double,
    val credit: Double,
    val balance: Double
)

@Serializable
data class LedgerJson(
    val partner: Partner?,
    val ledgerItems: List<LedgerItem>
)
