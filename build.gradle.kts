plugins {
    `maven-publish`
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
}

repositories {
    mavenCentral()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/satohu20xx/KMM-Sample")
            credentials {
                username =
                    "satohu20xx" // project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password =
                    "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" // project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            groupId = "com.choilabo"
            artifactId = "kmm-sample-library"
            version = "0.0.1"
            artifact("$projectDir/shared/build/outputs/aar/shared-release.aar")
        }
    }
}