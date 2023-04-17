pipeline {
    agent { label 'Agent ' }
    tools {
        //maven 'mvn-default'
          jdk 'jdk-default'
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
