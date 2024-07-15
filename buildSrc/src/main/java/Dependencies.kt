object Dependencies {
    object AndroidX {
        val coreKtx by lazy { "androidx.core:core-ktx:" + Versions.coreKtx }
        val appCompat by lazy { "androidx.appcompat:appcompat:" + Versions.appcompat }
        val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:" + Versions.constraintLayout }
        val activity by lazy {  "androidx.activity:activity:"+ Versions.activity }
    }

    object Onboarding {
        val onboarding by lazy { "androidx.core:core-splashscreen:"+Versions.onboardingApi }
    }
    object Test {
        val junit by lazy { "junit:junit:" + Versions.junit }
        val testExt by lazy { "androidx.test.ext:junit:" + Versions.junitVersion }
        val espresso by lazy { "androidx.test.espresso:espresso-core:" + Versions.espressoCore }
    }


    object Google {
        val material by lazy { "com.google.android.material:material:" + Versions.material }
    }

    object Chat {
        val sdk by lazy {
            "io.agora.rtc:chat-sdk:"+Versions.chatSdkVersion
        }
    }
}

object Modules {
    val chat = ":chat"
    val oboarding = ":onboarding"
    val central =":central"
}

