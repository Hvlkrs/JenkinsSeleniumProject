pipeline {
    agent any

    environment {
        PATH = "/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin"
    }

    stages {
        stage('Test Pipeline') {
            steps {
                echo 'Jenkins pipeline is working!'
                sh 'echo Running Maven tests...'
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}