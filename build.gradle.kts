plugins {
	java
	id("org.springframework.boot") version "4.0.8"
	id("io.spring.dependency-management") version "1.1.7"
	id("io.freefair.lombok") version "9.8.0"
}

group = "com.github.fedverdev"
version = "0.0.1-SNAPSHOT"
description = "Spring boot project"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.postgresql:postgresql:42.7.13")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-webmvc")
	testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springframework.boot:spring-boot-starter-liquibase")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
