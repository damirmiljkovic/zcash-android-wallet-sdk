[zcash-android-wallet-sdk](../../index.md) / [cash.z.wallet.sdk.data](../index.md) / [Synchronizer](index.md) / [clearedTransactions](./cleared-transactions.md)

# clearedTransactions

`abstract fun clearedTransactions(): ReceiveChannel<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ClearedTransaction`](../../cash.z.wallet.sdk.entity/-cleared-transaction/index.md)`>>`

A stream of all the transactions that are on the blockchain. Implementations should consider only returning a
subset like the most recent 100 transactions, perhaps through paging the underlying database.
