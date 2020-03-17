pipeline {
    agent { label 'slave01' }
    stages {
        stage('SCM Checkout'){
            steps{ git branch: 'master', url: 'https://github.com/developerideas5/Vehicle-Trip-Analyzer.git' }

        }
        stage('Compile Stage') {
            steps {
                sh 'mvn -v'
                sh 'mvn clean install'
            }
        }

        stage('Update Docker VehicleTripAnalyzer image') {

            steps {
                sh 'docker build --no-cache -t vta_image .'
            }
        }

        stage('Run VehicleTripAnalyzer container') {

            steps {
                script {
                    try {
                        sh 'docker exec vta_cont kill 1'
                        sh 'sleep 10'
                    } catch (err) {
                        echo err.getMessage()
                        sh 'echo failed to stop the contianer'
                    }

                    try {
                        sh 'docker rm vta_cont'

                    } catch (err) {
                        echo err.getMessage()
                        sh 'echo failed to remove the contianer'
                    } finally {
                        sh 'docker run -p 9090:9090 --name vta_cont -t -d vta_image'
                    }
                }

            }
        }
    }

}
