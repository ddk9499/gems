plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "uz.dkamaloff.gems.dependencies"
version = "SNAPSHOT"

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "uz.dkamaloff.gems.dependencies.DependenciesPlugin"
    }
}