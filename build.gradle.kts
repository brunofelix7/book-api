plugins {
	id("org.springframework.boot") version "3.3.1"
	id("io.spring.dependency-management") version "1.1.5"
	kotlin("jvm") version "1.9.24"
	kotlin("plugin.jpa") version "1.9.24"
	kotlin("plugin.spring") version "1.9.24"
}

group = "dev.brunofelix"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
	google()
}

dependencies {
	// Spring Data JPA
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	// Spring Web
	implementation("org.springframework.boot:spring-boot-starter-web")

	// Spring DevTools
	developmentOnly("org.springframework.boot:spring-boot-devtools")

	// Jackson
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

	// Kotlin Reflect
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	// Flyway
	implementation("org.flywaydb:flyway-core")
	implementation("org.flywaydb:flyway-mysql")

	// MySQL Connector
	runtimeOnly("mysql:mysql-connector-java:8.0.28")

	// Tests
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
