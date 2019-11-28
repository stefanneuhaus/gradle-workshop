package plugin

import org.gradle.testkit.runner.GradleRunner
import spock.lang.Specification

class PluginPluginFunctionalTest extends Specification {

    def "can run task"() {
        given:
        def projectDir = new File("build/functionalTest")
        projectDir.mkdirs()
        new File(projectDir, "settings.gradle") << """
            rootProject.name = 'functionalTest'
        """
        new File(projectDir, "build.gradle") << """
            plugins {
                id('com.rewedigital.gitcommit')
            }
        """

        when:
        def runner = GradleRunner.create()
        runner.forwardOutput()
        runner.withPluginClasspath()
        runner.withArguments("determineGitCommitHash")
        runner.withProjectDir(projectDir)
        def result = runner.build()

        then:
        result.output.contains('running determineGitCommitHash')
    }
}
