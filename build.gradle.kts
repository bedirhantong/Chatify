// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version Config.agp apply false
    id("org.jetbrains.kotlin.android") version Config.kotlin apply false
    id("com.android.library") version Config.agp apply false
}

tasks.register("clean",Delete::class) {
    delete(rootProject.layout.buildDirectory)
}