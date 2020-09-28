package com.github.dwade75.jirabranchslugify.services

import com.intellij.openapi.project.Project
import com.github.dwade75.jirabranchslugify.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
