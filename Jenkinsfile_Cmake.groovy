pipeline {
    agent { label 'Agent ' }
   // tools {
        //maven 'mvn-default'
        //  CMake
   // }

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
                sh 'chmod +x Bash_script.sh'
                sh 'Bash_script.sh'
                
            }
        }
        
        stage('Test') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
