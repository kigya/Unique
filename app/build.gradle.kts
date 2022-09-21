plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.kigya.consulado"
        minSdk = 23
        targetSdk = 33
        versionCode = 2
        versionName = "0.9.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("debug")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    
    kotlinOptions.jvmTarget = "1.8"

    viewBinding.enable = true

    namespace = "com.kigya.consulado"
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

    // Jsoup
    implementation("org.jsoup:jsoup:1.13.1")

    // ViewBindingPropertyDelegate
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6")

    // Navigation Components
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.2")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    // Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")

    // Architectural Components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.43.2")
    annotationProcessor("com.google.dagger:hilt-compiler:2.43.2")
    kapt("com.google.dagger:hilt-compiler:2.43.2")

    // AnimatedBottomBar
    implementation("nl.joery.animatedbottombar:library:1.1.0")

    // Room
    implementation("androidx.room:room-runtime:2.4.3")
    kapt("androidx.room:room-compiler:2.4.3")

    // Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:2.4.3")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")

    // PowerSpinner
    implementation("com.github.skydoves:powerspinner:1.2.4")

        // SurroundCardView
    implementation("com.furkanakdemir:surroundcardview:1.0.6")

    // RoundCornerProgressBar
    implementation("com.akexorcist:round-corner-progress-bar:2.1.2")

    // RecyclerView Animators
    implementation("jp.wasabeef:recyclerview-animators:4.0.2")

    // DataStore Preferences
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    // ToggleButtonGroup
    implementation("com.nex3z:toggle-button-group:1.2.3")

}