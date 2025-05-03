// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    // Agregar el complemento de Google Services para Firebase
    id("com.google.gms.google-services") version "4.4.2" apply false
}

allprojects {
    repositories {
        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
            repositories {
                google()  // Asegúrate de que el repositorio Google esté disponible para Firebase
                mavenCentral()  // Esto también es importante para muchas dependencias
            }
        }
        mavenCentral()
    }
}
