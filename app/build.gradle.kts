plugins {
    id("com.android.app")
    id("com.android.room")
    id("com.android.compose")
    id("com.jvm.dagger")
}

android {
    namespace = "com.oriabova.app"

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(AndroidX.activity.compose)
}