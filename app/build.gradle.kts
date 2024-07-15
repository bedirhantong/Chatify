plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.bedirhan.chatapp"
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        dataBinding = true
    }
}

dependencies {

    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation(Dependencies.AndroidX.activity)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.Google.material)

    // Test
    implementation(Dependencies.Test.junit)
    implementation(Dependencies.Test.testExt)
    implementation(Dependencies.Test.espresso)

    // Modules
    implementation(project(Modules.chat))
    implementation(project(Modules.oboarding))
    implementation(project(Modules.central))

    // Onboarding
    implementation(Dependencies.Onboarding.onboarding)


}