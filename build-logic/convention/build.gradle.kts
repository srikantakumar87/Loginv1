@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
   `kotlin-dsl`
}
group = "com.sri.login.buildlogic"

dependencies{
   compileOnly(libs.android.gradlePlugin)
   compileOnly(libs.android.tools.common)
   compileOnly(libs.kotlin.gradlePlugin)
   compileOnly(libs.ksp.gradlePlugin)
   compileOnly(libs.room.gradlePlugin)
}

gradlePlugin{
   plugins{
      register("androidApplication"){
         id = "login.android.application"
         implementationClass = "AndroidApplicationConventionPlugin"

      }
      register("androidApplicationCompose"){
         id = "login.android.application.compose"
         implementationClass = "AndroidApplicationComposeConventionPlugin"

      }
      register("androidLibrary"){
         id = "login.android.library"
         implementationClass = "AndroidLibraryConventionPlugin"

      }
      register("androidLibraryCompose"){
         id = "login.android.library.compose"
         implementationClass = "AndroidLibraryComposeConventionPlugin"

      }
      register("androidFeatureUi"){
         id = "login.android.feature.ui"
         implementationClass = "AndroidFeatureUiConventionPlugin"

      }
      register("androidRoom"){
         id = "login.android.room"
         implementationClass = "AndroidRoomConventionPlugin"

      }
      register("jvmLibrary"){
         id = "login.jvm.library"
         implementationClass = "JvmLibraryConventionPlugin"

      }
      register("jvmKtor"){
         id = "login.jvm.ktor"
         implementationClass = "JvmKtorConventionPlugin"

      }
   }

}


