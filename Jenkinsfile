pipeline {
    agent any
    tools { 
      maven 'jenkinsmaven' 
      jdk 'JAVA17'
    }
    stages {
    stage('Checkout') {
      steps {
        checkout([
          $class: 'GitSCM', 
          branches: [[name: 'main']],
          userRemoteConfigs: [[url: '']]
        ])
      }
    }
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('Archive') {
      steps {
        archiveArtifacts artifacts: "**/target/*.jar", fingerprint: true
      }
    }
    stage('Test') {
      steps {
        sh "mvn test"
        junit '**/target/surefire-reports/TEST-*.xml'
      }
    }
  }
}