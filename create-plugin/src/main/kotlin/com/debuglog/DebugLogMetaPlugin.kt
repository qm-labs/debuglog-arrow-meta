package com.debuglog

import arrow.meta.Meta
import arrow.meta.CliPlugin
import arrow.meta.phases.CompilerContext
import kotlin.contracts.ExperimentalContracts

class DebugLogMetaPlugin : Meta {
//    @ExperimentalContracts
    override fun intercept(ctx: CompilerContext): List<CliPlugin> =
        listOf(
            debugLog
        )
}
