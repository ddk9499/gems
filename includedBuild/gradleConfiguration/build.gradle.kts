import uz.dkamaloff.gems.dependencies.Deps

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("dependencies")
}

repositories {
    google()
    jcenter()
    gradlePluginPortal()
}

dependencies {
    implementation(Deps.kotlin.plugin)
    implementation(Deps.android.plugin)
    // will make autocompletion work with Deps
    implementation("uz.dkamaloff.gems.dependencies:dependencies:SNAPSHOT")
}

gradlePlugin {
    plugins.register("android-configuration") {
        id = "android-configuration"
        implementationClass = "uz.dkamaloff.gems.configuration.AndroidConfigurationPlugin"
    }
}