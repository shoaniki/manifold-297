plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

val manifoldVersion = "2021.1.25"

dependencies {
    annotationProcessor("systems.manifold:manifold:$manifoldVersion")
    implementation("systems.manifold:manifold-rt:$manifoldVersion")

    annotationProcessor("systems.manifold:manifold-ext:$manifoldVersion")
    implementation("systems.manifold:manifold-ext-rt:$manifoldVersion")

    annotationProcessor("systems.manifold:manifold-props:$manifoldVersion")
    implementation("systems.manifold:manifold-props-rt:$manifoldVersion")

    annotationProcessor("systems.manifold:manifold-collections:$manifoldVersion")
    implementation("systems.manifold:manifold-collections:$manifoldVersion")

    annotationProcessor("systems.manifold:manifold-text:$manifoldVersion")
    implementation("systems.manifold:manifold-text:$manifoldVersion")
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xplugin:Manifold")
}
