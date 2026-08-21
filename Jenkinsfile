pipeline {
    agent any

    environment {
        PATH = "/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin"
        BASE_URL = 'https://www.saucedemo.com/'
        HEADLESS = 'true'
    }

    stages {
        stage('Run Tests') {
            steps {
                withCredentials([
                    usernamePassword(
                        credentialsId: 'sauce-credentials',
                        usernameVariable: 'SAUCE_USERNAME',
                        passwordVariable: 'SAUCE_PASSWORD'
                    )
                ]) {
                    sh 'mvn clean test'
                }
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}