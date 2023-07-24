# CodeCoverageIssue
For checking Jacoco code coverage after configuring Java 17 and Gradle 8.

Jacoco v0.8.10 (latest) is reporting 0% code coverage in its report. To check the alternatives, this project was created to test different Jacoco versions.
It was observed that proper coverage is reported for library modules, but not for the application module.

Through trial and error, it was concluded that coverage is reported for Jacoco v0.8.8 when configured with Java 17.
