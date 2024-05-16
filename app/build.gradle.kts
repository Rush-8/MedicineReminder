plugins {
    alias(libs.plugins.android.application)
}

configurations.all {
    resolutionStrategy.force("com.android.tools.build:gradle:7.3.0")
}

android {
    namespace = "com.example.medicinereminder"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.medicinereminder"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.core:core:1.13.0") {
        exclude(group = "com.android.support", module = "support-compat")}


    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("com.github.sundeepk:compact-calendar-view:$rootProject.compactCalendarViewVersion")
    implementation("com.github.sundeepk:compact-calendar-view:3.0.0")

    implementation("androidx.recyclerview:recyclerview:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.core:core-ktx:1.10.1")


    testImplementation("junit:junit:4.13.2")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.jakewharton:butterknife:10.2.1")
    annotationProcessor ("com.jakewharton:butterknife-compiler:10.2.1")
}
