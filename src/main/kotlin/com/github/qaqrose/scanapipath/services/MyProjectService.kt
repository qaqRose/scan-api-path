package com.github.qaqrose.scanapipath.services

import com.intellij.openapi.project.Project
import com.github.qaqrose.scanapipath.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
