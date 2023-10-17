plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")

}

android {

//    publishing {
//        singleVariant("release") {
//            // if you don't want sources/javadoc, remove these lines
//            withSourcesJar()
//            withJavadocJar()
//        }
//    }
    namespace = "com.example.list_tiles"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }



}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")

}


publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.github.raheez-kpit"
            artifactId = "list-tile-compose"
            version = "1.0"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}



//afterEvaluate {
//    publishing {
//        publications {
//
//        }
//    }
//}


//
//afterEvaluate {
//    publishing {
//        publications {
//            myPublication(MavenPublication){
//
//            }
//            release(MavenPublication) {
//                from components.release
//
//                        groupId = "com.github.philipplackner"
//                artifactId = "image-preview-compose"
//                version = "1.0"
//            }
//        }
//    }
//}