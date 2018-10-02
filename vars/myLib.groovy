#!/usr/bin/env groovy

def call() {
  //archiving the file.  Files will be present at /var/lib/jenkins/jobs/apple_coding/builds/<buildnumber>/archive/
    echo "archive"
    archiveArtifacts '*.txt'
    echo "END - archive"
    //zipping the updated files in the workspace location. The location can be updated to put in common place.
    echo "ZIP"
    sh "zip -R build.zip *.txt"
    echo "END - ZIP"
}
