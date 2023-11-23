plugins {
    id("java")
}

group = "org.example"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
   }

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}