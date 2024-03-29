pipeline {

	agent any 
	
	tools { 
      maven 'maven_3_9_6'
    }

	environment {
		DOCKER_IMAGE_NAME = 'calculator'
		GITHUB_REPO_URL = 'https://github.com/hemantkumarc/SPE_MiniProject.git'
	}

	stages {
		
		stage('Clone Project')
		{
			steps {

				script{
					git branch: 'main', url: "${GITHUB_REPO_URL}"
				}

			}
		}

		stage('Build Code')
		{
			steps {
				sh "mvn clean package"
			}
		}


		stage('Test Code')
		{
			steps {
				sh "mvn test"
			}
		}

		stage('Building Docker Image')
		{
			steps {

				script {
					docker.build("${DOCKER_IMAGE_NAME}", '.')
				}

			}
		}

		stage('Pushing Docker Image')
		{
			steps {

				script {

					docker.withRegistry('', 'dockerhub-credentials') {

						sh "docker image tag calculator hemantkumarcpersonal/calculator:latest"
						sh "docker push hemantkumarcpersonal/calculator:latest"

					}
				}

			}
		}

		stage('Run Ansible Playbook')
		{
			steps {

				script {

					ansiblePlaybook (

						playbook: 'playbook.yml',
						inventory: 'inventory'

					)
				}
			}
		}
	}
}
