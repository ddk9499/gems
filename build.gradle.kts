@file:Suppress("SpellCheckingInspection")

allprojects {
    repositories {
        jcenter()
        mavenCentral()
        google()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}