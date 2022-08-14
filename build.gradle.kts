plugins {
    val kotlinVersion = "1.6.21"
    kotlin("multiplatform") version kotlinVersion apply false
    kotlin("android") version kotlinVersion apply false
    kotlin("jvm") version kotlinVersion apply false

    val composeVersion = "1.2.0-alpha01-dev725"
    id("org.jetbrains.compose") version composeVersion apply false

    val agpVersion = "4.1.0"
    id("com.android.application") version agpVersion apply false
    id("com.android.library") version agpVersion apply false
}