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
        stage('make directory') {
            steps {
                echo 'make directory'
                sh ' mkdir build && cd build '
               
            }
        }
        stage('Build') {
            steps {
                echo 'Hello World'
                 
               // sh 'chmod +x $(pwd)/ Bash_script.sh'
               // sh '$(pwd)/Bash_script.sh'  
                // sh '$(pwd)/Script_Yocto_SDV_EVAL.sh'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
