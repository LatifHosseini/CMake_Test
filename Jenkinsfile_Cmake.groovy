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
                 cmake 'InSearchPath'
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
