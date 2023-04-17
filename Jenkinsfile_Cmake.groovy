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
        
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
