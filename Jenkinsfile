pipeline {
  agent {
    docker {
      image 'maven:3.9.4-eclipse-temurin-23'
      args '-v $HOME/.m2:/root/.m2'
    }
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build & Test') {
      steps {
        sh 'mvn -B clean test package'
      }
    }

    stage('Archive') {
      steps {
        archiveArtifacts artifacts: 'target/*.jar, target/*.war, target/surefire-reports/**', fingerprint: true, allowEmptyArchive: true
      }
    }
  }

  post {
    always {
      junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml, target/**/TEST-*.xml'
      archiveArtifacts artifacts: 'target/surefire-reports/**', allowEmptyArchive: true
      deleteDir()
    }
  }
}