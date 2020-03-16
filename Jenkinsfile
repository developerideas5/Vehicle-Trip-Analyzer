pipeline {
    agent { label 'slave01' }
      stages {
        stage ('Compile Stage') {

            steps {
               sh 'mvn clean compile'
	    }
        }

        stage ('Testing Stage') {

            steps {
                sh 'mvn test'
            }
        }
		
		stage('Build Stage') {
            steps {
                sh 'mvn install'
            }
        }

         
          stage('Update Docker VehicleTripAnalyzer image') {
            when { branch "master" }
            steps {
                sh '''
		docker build --no-cache -t vta_image .					
                '''
            }
        }

        stage('Run VehicleTripAnalyzer container') {
            when { branch "master" }
            steps {
                sh '''
		docker stop vta_cont
		docker rm vta_cont
		docker run -p 9090:8081 --name vta_cont -t -d vta_image
                '''
            }
        }
    }
    
}
