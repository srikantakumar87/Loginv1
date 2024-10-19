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
   }

}


