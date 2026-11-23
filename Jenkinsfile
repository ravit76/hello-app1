pipeline{
	agent	any
	stages{
		stage('Welcome'){
			steps{
				echo "Hello world"
			}
		}
		stage('Check Java version') {
			steps{
				bat 'java --version'
			}
		}
		stage('Check Maven version') {
			steps{
				bat 'mvn -version'
			}
		}
		stage('Clean and compile'){
			steps{
				bat 'mvn clean compile'
			}
		}
		stage('test'){
			steps{
				bat 'mvn test'
			}
			post{
				always{
					junit 'targets/surefire-reports/*.xml'
				}
			}
		}
		stage('Package') {
			steps{
				bat 'mvn package'
			}
		}
	}
}