package org.example.learningfast

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform