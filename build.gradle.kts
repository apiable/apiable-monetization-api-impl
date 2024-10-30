import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

allprojects {
	group = "io.apiable"
	version = "0.0.1-SNAPSHOT"
	java.sourceCompatibility = JavaVersion.VERSION_21

	repositories {
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
	}

}

plugins {
	val kotlinPlugin = "2.0.21" // https://kotlinlang.org/docs/gradle.html
	kotlin("jvm") version kotlinPlugin
	kotlin("plugin.spring") version kotlinPlugin
	kotlin("plugin.allopen") version kotlinPlugin
	kotlin("plugin.serialization") version kotlinPlugin
	kotlin("kapt") version kotlinPlugin
}

allOpen {
	annotation("javax.persistence.Entity")
	annotation("javax.persistence.Embeddable")
	annotation("javax.persistence.MappedSuperclass")
}

dependencies {
	implementation(fileTree(mapOf("dir" to "../apiable-monetization-api/build/libs", "include" to listOf("*.jar"))))
	implementation("org.slf4j:slf4j-api:2.0.0")
}


tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "19"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
