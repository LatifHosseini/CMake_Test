pipeline {
    agent { label 'Agent ' }
    tools {
        //maven 'mvn-default'
          CMake
    }

    stages {
        stage('checkout') {
            steps {
                echo 'Hello World'
                cleanWs()
                 checkout scm
            }
        }
        
        stage('Build') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
