plugins {
    kotlin("android")
    id("com.android.application")
    id("org.jetbrains.compose")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.issue"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":common"))

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.5.0")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation("androidx.activity:activity-compose:1.5.1")

    implementation(compose.ui)
    implementation(compose.foundation)
    implementation(compose.material)
    implementation(compose.runtime)
    implementation(compose.materialIconsExtended)

    implementation("com.google.accompanist:accompanist-systemuicontroller:0.24.13-rc")

    implementation("io.coil-kt:coil-compose:2.1.0")
    implementation("io.coil-kt:coil-gif:2.1.0")

    implementation("io.insert-koin:koin-core:3.2.0")
    implementation("io.insert-koin:koin-androidx-compose:3.2.0")
}
