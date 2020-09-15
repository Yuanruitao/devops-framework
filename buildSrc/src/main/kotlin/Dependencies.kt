object Libs {
    const val KotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.Kotlin}"
    const val KotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}"
    const val SpringBootGradlePlugin = "org.springframework.boot:spring-boot-gradle-plugin:${Versions.SpringBoot}"
    const val DependencyManagement = "io.spring.gradle:dependency-management-plugin:${Versions.DependencyManagement}"
    const val KotlinSpringGradlePlugin = "org.jetbrains.kotlin:kotlin-allopen:${Versions.Kotlin}"
}

object MavenBom {
    const val SpringBoot = "org.springframework.boot:spring-boot-dependencies:${Versions.SpringBoot}"
    const val SpringCloud = "org.springframework.cloud:spring-cloud-dependencies:${Versions.SpringCloud}"
}
