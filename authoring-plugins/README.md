# Authoring Binary Plugins

## Exercise 1: Client Build failing

* Go to the "client" Build and apply a plugin with the ID `com.rewedigital.git-commit` and version `1.0`. Verify that the build fails complaining about the
 unresolvable plugin.


## Exercise 2: Plugin Build
* Create a build/directory `plugin` alongside the client build. You may want to use the `init` task to initialize a Plugin build project.
* Implement the Plugin Main Class. Register a task `determineGitCommitHash`. Use `org.gradle.api.logging.Logging` to get a `Logger` instance. Log some test
 output during the task's execution and configuration phase.
* If you used the `init` task to bootstrap the plugin build, fix the tests.
* Verify that the project builds successfully.
* Apply the [`maven-publish` core plugin](https://docs.gradle.org/current/userguide/publishing_maven.html), provide proper maven coordinates for your project
 and publish your built plugin to your local maven repository.


## Exercise 3: Client Build passing

* Verify that you can execute the `determineGitCommitHash` task. Use the `--console plain` Gradle option and observe that the test log statements get logged
 during the expected build phase.
* Execute just the `help` task and verify that the test log output does not appear. If you used the [Configuration Avoidance API](https://docs.gradle.org/current/userguide/task_configuration_avoidance.html)
 even the log statements to occur during the configuration phase won't show up.
