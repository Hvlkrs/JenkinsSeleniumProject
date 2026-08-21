pipeline {
    agent any

    environment {
        PATH = "/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin"

        SAUCE_CREDENTIALS = credentials('sauce-credentials')
        SAUCE_USERNAME = "${SAUCE_CREDENTIALS_USR}"
        SAUCE_PASSWORD = "${SAUCE_CREDENTIALS_PSW}"

        BASE_URL = 'https://www.saucedemo.com/'
        HEADLESS = 'true'
    }

    stages {
        stage('Run Tests') {
            steps {
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