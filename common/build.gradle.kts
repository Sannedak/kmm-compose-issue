plugins {
    kotlin("multiplatform")
    //id("com.android.library")
    id("org.jetbrains.compose")
}

kotlin {
    //android()
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(compose.runtime)
            }
        }
        /*val androidMain by getting {
            dependsOn(commonMain)
            dependencies {
                implementation("androidx.appcompat:appcompat:1.5.0")
                implementation("androidx.core:core-ktx:1.8.0")
            }
        }*/
    }
}

/*android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        named("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            res.srcDirs("src/androidMain/res", "src/commonMain/resources")
            assets.srcDirs("src/androidMain/assets", "src/commonMain/assets")
        }
    }
}*/

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}