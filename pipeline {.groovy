pipeline {
    agent { label 'server-1' }
    stages {
        stage('Pull Code From GitHub') {
            steps {
                git 'https://github.com/Bala621/Mazeball.git'
            }
        }
    }
}