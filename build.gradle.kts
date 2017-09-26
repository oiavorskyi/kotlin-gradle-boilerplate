import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlin_version by extra { "1.1.50" }

// The settings.gradle defines versions of the specified plugins
plugins {
    kotlin("jvm")
    kotlin("plugin.spring") // Generates Kotlin classes compatible with Spring
    id("org.springframework.boot")
}

// Starting from 2.0.0 Spring Boot plugin does not apply dependency management
// plugin automatically. Applying it explicitly.
apply {
    plugin("io.spring.dependency-management")
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
    maven { setUrl("https://repo.spring.io/milestone") } //for Spring milestones only

}

dependencies {
    compile(kotlin("stdlib-jre8", kotlin_version))
    compile(kotlin("reflect", kotlin_version))
    compile("org.springframework.boot:spring-boot-starter")

    testCompile("org.springframework.boot:spring-boot-starter-test")
}
