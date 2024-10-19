plugins {
    alias(libs.plugins.login.android.library)
}

android {
    namespace = "com.sri.auth.data"

}

dependencies {

    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)

}