package cash.z.wallet.sdk.ext

/**
 * Wrapper for all the constant values in the SDK. It is important that these values stay fixed for
 * all users of the SDK. Otherwise, if individual wallet makers are using different values, it
 * becomes easier to reduce privacy by segmenting the anonymity set of users, particularly as it
 * relates to network requests.
 */
object ZcashSdk {

    /**
     * Miner's fee in zatoshi.
     */
    const val MINERS_FEE_ZATOSHI = 10_000L

    /**
     * The number of zatoshi that equal 1 ZEC.
     */
    const val ZATOSHI_PER_ZEC = 100_000_000L

    /**
     * The height of the first sapling block. When it comes to shielded transactions, we do not need to consider any blocks
     * prior to this height, at all.
     */
    const val SAPLING_ACTIVATION_HEIGHT = 280_000

    /**
     * The theoretical maximum number of blocks in a reorg, due to other bottlenecks in the protocol design.
     */
    const val MAX_REORG_SIZE = 100

    /**
     * The amount of blocks ahead of the current height where new transactions are set to expire. This value is controlled
     * by the rust backend but it is helpful to know what it is set to and shdould be kept in sync.
     */
    const val EXPIRY_OFFSET = 20

    /**
     * Default size of batches of blocks to request from the compact block service.
     */
    const val DOWNLOAD_BATCH_SIZE = 100

    /**
     * Default amount of time, in milliseconds, to poll for new blocks. Typically, this should be about half the average
     * block time.
     */
    const val POLL_INTERVAL = 75_000L

    /**
     * Default attempts at retrying.
     */
    const val RETRIES = 5

    /**
     * The default maximum amount of time to wait during retry backoff intervals. Failed loops will never wait longer than
     * this before retyring.
     */
    const val MAX_BACKOFF_INTERVAL = 600_000L

    /**
     * Default number of blocks to rewind when a chain reorg is detected. This should be large enough to recover from the
     * reorg but smaller than the theoretical max reorg size of 100.
     */
    const val REWIND_DISTANCE = 10

    /**
     * The default port to use for connecting to lightwalletd instances.
     */
    const val LIGHTWALLETD_PORT = 9067

    const val DB_DATA_NAME = "transactionData.db"
    const val DB_CACHE_NAME = "compactBlockCache.db"

    /**
     * File name for the sappling spend params
     */
    const val SPEND_PARAM_FILE_NAME = "sapling-spend.params"

    /**
     * File name for the sapling output params
     */
    const val OUTPUT_PARAM_FILE_NAME = "sapling-output.params"

}