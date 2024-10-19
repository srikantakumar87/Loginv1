plugins {

    alias(libs.plugins.login.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}