package plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging

import static java.util.stream.Collectors.joining

class PluginPlugin implements Plugin<Project> {

    static final Logger LOG = Logging.getLogger(PluginPlugin.class)

    void apply(Project project) {

        def extension = project.extensions.create('conversation', PluginPluginExtension, project)

        project.tasks.register('determineGitCommitHash') {
            LOG.info('configuring ...')

            logPluginExtensionProperties(extension)

            doLast {
                LOG.quiet('running determineGitCommitHash ...')

                LOG.info('execution started.')
                LOG.info('execution done.')
            }

            LOG.info('configuration done.')
        }
    }


    void logPluginExtensionProperties(pluginExtension) {
        def propertyBlacklist = ['asDynamicObject', 'class', 'convention', 'conventionMapping', 'extensions']
        def extensionProperties = pluginExtension.properties.entrySet().stream()
                .filter { entry -> !propertyBlacklist.contains(entry.key) }
                .map { entry -> "$entry.key = $entry.value" }
                .collect(joining('\n'))
        LOG.quiet(extensionProperties)
    }
}
