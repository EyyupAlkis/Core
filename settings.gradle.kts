pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Core"
include(":app")
include(":data:data")
include(":data:retrofit")
include(":presentation:home")
include(":library:router")
include(":library:common")
include(":domain")
