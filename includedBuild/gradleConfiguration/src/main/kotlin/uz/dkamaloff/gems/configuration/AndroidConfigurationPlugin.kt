package uz.dkamaloff.gems.configuration

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.dependencies
import uz.dkamaloff.gems.dependencies.Deps

class AndroidConfigurationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        configureAndroidCompilation(target)
    }

    private fun configureAndroidCompilation(project: Project) {
        project.apply(plugin = "com.android.library")
        project.extensions.configure(BaseExtension::class.java) {
            buildToolsVersion("30.0.2")
            compileSdkVersion(30)
            defaultConfig {
                minSdkVersion(21)
                targetSdkVersion(30)
            }

            sourceSets.getByName("main") {
                java.srcDirs("src/main/kotlin")
                manifest.srcFile("src/main/AndroidManifest.xml")
                res.srcDir("src/main/res")
            }
        }

        project.dependencies {
            add("implementation", Deps.kotlin.stdlib)
        }
    }
}