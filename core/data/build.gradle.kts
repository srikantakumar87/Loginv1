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

}