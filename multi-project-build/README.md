# Multi-project Build

## Exercise 1: Multi-project Java-Build

* Extend the project `multi-project-build` to a multi-project build having the following structure:
```
Root project 'multi-project-build'
+--- Project ':api'
\--- Project ':core'
     +--- Project ':core:service-a'
     \--- Project ':core:service-b'
```

* Apply the `java` plugin to all of its sub-projects (recursively).
* Redefine the name of the sub-projects' build script to the respective project's name.
* When executing the `compileJava` task on the root project, verify that the task with the same name is being executed on every sub-project. You can use the
 `--console plain` option to see every executed task in the console.
