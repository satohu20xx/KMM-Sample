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
            url = uri("https://github.com/satohu20xx/KMM-Sample")
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
            artifactId = "kmmsampelibrary"
            version = "0.0.1"
//            from(components["java"])
//            pom {
//                name = "Satohu20xx KMM Sample"
//                description = "sample"
//                url = "https://github.com/satohu20xx/KMM-Sample"
//            }
        }
    }
}