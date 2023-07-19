pipeline {
    agent any
    stages {
        stage('Test') {
            steps {
                sh 'ls'
            	sh 'docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Second Suite" -apiKey=016f9d34-7f99-4cfb-bc83-b24625cc0a9b'
                
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'Reports/**/*.*', fingerprint: true
            junit 'Reports/**/JUnit_Report.xml'
        }
    }
}