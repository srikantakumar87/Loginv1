plugins {
    alias(libs.plugins.login.android.library)
}

android {
    namespace = "com.sri.core.database"

}

dependencies {

    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)

}