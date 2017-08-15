import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlin_version by extra { "1.1.4" }

plugins {
    kotlin("jvm")
}

// It is possible to configure each task separately (prod/test)
// but this way is simpler
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jre8", kotlin_version))
}
