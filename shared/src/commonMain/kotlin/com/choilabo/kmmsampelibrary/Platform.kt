package com.choilabo.kmmsampelibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform