pipeline {
    agent any

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