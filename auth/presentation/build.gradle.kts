plugins {
    alias(libs.plugins.login.android.feature.ui)
    alias(libs.plugins.compose.compiler)

}

android {
    namespace = "com.sri.auth.presentation"

}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}