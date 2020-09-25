package uz.dkamaloff.gems.dependencies

object Deps {
    private const val kotlinVersion = "1.3.72"

    val kotlin = Kotlin("org.jetbrains.kotlin")
    val android = Android

    class Kotlin(groupName: String) {
        val stdlib = "$groupName:kotlin-stdlib:$kotlinVersion"
        val plugin = "$groupName:kotlin-gradle-plugin:$kotlinVersion"
    }

    object Android {
        const val plugin = "com.android.tools.build:gradle:3.6.0"
    }
}