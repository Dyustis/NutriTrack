plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // Plugin de servicios de Google para Firebase
    id("com.google.gms.google-services")
}

android {
    namespace = "com.nutritrack.app"
    applicationId = "com.nutritrack.app"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    // Importar la BoM (Bill of Materials) de Firebase
    implementation(platform("com.google.firebase:firebase-bom:33.13.0"))

    // Firebase Authentication y Analytics
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-analytics")

    // Dependencias básicas de Android y Kotlin
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}

// Aplica el plugin de Google Services
apply(plugin = "com.google.gms.google-services")
