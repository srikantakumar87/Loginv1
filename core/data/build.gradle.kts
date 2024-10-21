plugins {
    alias(libs.plugins.login.android.library)
    alias(libs.plugins.login.jvm.ktor)
    alias(libs.plugins.compose.compiler)

}

android {
    namespace = "com.sri.core.data"




}

dependencies {

    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.core.database)

    implementation(platform(libs.androidx.compose.bom))   // Align versions with BOM
    implementation("androidx.compose.runtime:runtime:1.7.4") // Add Compose runtime
    //implementation(libs.compose.run.time)
    //implementation(libs.compose.ui)
    // Other dependencies

}