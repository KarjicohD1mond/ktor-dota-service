package com.mdota.utlis.` extension`

import ch.qos.logback.classic.Level
import ch.qos.logback.classic.LoggerContext
import com.mongodb.client.MongoClient
import org.slf4j.LoggerFactory

fun MongoClient.configLog(disable: Boolean) {
    val loggerContext = LoggerFactory.getILoggerFactory() as LoggerContext
    val rootLogger = loggerContext.getLogger("org.mongodb.driver")
    rootLogger.level = if (disable) {
        Level.OFF
    } else {
        Level.DEBUG
    }
}