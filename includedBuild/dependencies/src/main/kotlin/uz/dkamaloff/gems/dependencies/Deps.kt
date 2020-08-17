package uz.dkamaloff.gems.dependencies

object Deps {
    private const val kotlinVersion = "1.3.72"

    val kotlin = Kotlin("org.jetbrains.kotlin")

    class Kotlin(groupName: String) {
        val stdlib = "$groupName:kotlin-stdlib:$kotlinVersion"
        val plugin = "$groupName:kotlin-gradle-plugin:$kotlinVersion"
    }
}