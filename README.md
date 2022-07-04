# payara-jdk-tester

This is a demo repo used to try out and troubleshoot possible JDK 17 issues on Payara Micro.

In order to run this app:
1. checkout any branch. Each branch requires a different JDK version, from 8 to 17(master). All of them LTS.
2. make sure you have the right JDK ready
3. run ``mvn clean install`` on the project
4. run ``mvn payara-micro:start``. The pom definition for the goal start is already expecting an uber JAR
5. analyse output in console
