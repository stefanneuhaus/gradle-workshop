package plugin


import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project

class PluginPluginExtension {

    String hello
    NamedDomainObjectContainer<MyProject> projects

    PluginPluginExtension(Project project) {
        this.projects = project.container(MyProject)
    }
}


class MyProject {

    String content1 = 'default for content1'
    String content2 = 'default for content2'
    private String name

    MyProject(String name) {
        this.name = name
    }

    String toString() {
        return "$name = [content1=$content1; content2=$content2]"
    }
}
