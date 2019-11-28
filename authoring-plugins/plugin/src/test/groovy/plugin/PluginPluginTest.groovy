package plugin

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification


class PluginPluginTest extends Specification {

    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("com.rewedigital.gitcommit")

        then:
        project.tasks.findByName("determineGitCommitHash") != null
    }
}
