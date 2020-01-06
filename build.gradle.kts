plugins {
	kotlin("jvm") version "1.3.61"
}

java.sourceCompatibility = JavaVersion.VERSION_11

allprojects {
	group = "gh.mm"
	version = "1.0.0-SNAPSHOT"

	repositories {
		mavenCentral()
	}
}
