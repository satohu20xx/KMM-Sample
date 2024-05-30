package com.choilabo.kmmlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform