package com.wooyj.migration_compose.data.util

import android.util.Base64

fun String.getDecodeData(): ByteArray {
    var bytes: ByteArray = ByteArray(1)
    bytes = try {
        Base64.decode(this, Base64.DEFAULT)
    } catch (e: Exception) {
        Base64.decode(this.replace(" ", "+"), Base64.DEFAULT)
    }
    return bytes
}
