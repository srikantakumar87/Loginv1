plugins {

    alias(libs.plugins.login.jvm.library)
}


dependencies{
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.androidx.annotation.jvm)
    implementation(libs.androidx.runtime.android)
}