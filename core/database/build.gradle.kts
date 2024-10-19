plugins {
    alias(libs.plugins.login.android.library)
    alias(libs.plugins.login.android.room)
}

android {
    namespace = "com.sri.core.database"

}

dependencies {

    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)

}