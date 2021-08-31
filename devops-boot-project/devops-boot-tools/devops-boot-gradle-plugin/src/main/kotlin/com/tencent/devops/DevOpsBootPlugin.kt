package com.tencent.devops

import com.tencent.devops.conventions.JUnitConvention
import com.tencent.devops.conventions.JavaConvention
import com.tencent.devops.conventions.KotlinConvention
import com.tencent.devops.conventions.RepositoryConvention
import com.tencent.devops.conventions.SpringBootConvention
import org.gradle.api.Plugin
import org.gradle.api.Project
import java.nio.file.Files

/**
 * DevOps Boot Gradle插件，提供公共配置
 */
class DevOpsBootPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        RepositoryConvention().apply(project)
        // solve issue 73
        JavaConvention().apply(project)
        KotlinConvention().apply(project)
        // ignore the next configuration if this is an empty project
        if (isNotEmptyProject(project)) {
            SpringBootConvention().apply(project)
            JUnitConvention().apply(project)
        }
    }

    /**
     * 是否为非空项目
     */
    private fun isNotEmptyProject(project: Project): Boolean {
        return Files.exists(project.projectDir.toPath().resolve("src"))
    }
}
