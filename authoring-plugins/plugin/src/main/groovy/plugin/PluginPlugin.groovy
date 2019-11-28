package plugin

import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging

class PluginPlugin implements Plugin<Project> {

    static final Logger LOG = Logging.getLogger(PluginPlugin.class)

    void apply(Project project) {
        project.tasks.register('determineGitCommitHash') {
            LOG.info('configuring ...')

            doLast {
                LOG.quiet('running determineGitCommitHash ...')

                LOG.info('execution started.')
                LOG.info('execution done.')
            }

            LOG.info('configuration done.')
        }
    }
}
