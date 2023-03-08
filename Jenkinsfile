pipeline {
    agent any 
    
    environment {
        DEMO = '1.3'
    }
    
    stages {
        stage('stage1') {
            steps {
                echo "This is $BUILD_NUMBER of demo $DEMO"
                sh ''' 
                    echo "Using a multiline shell step"
                    chmod +x test.sh
                    ./test.sh
                '''
            }
        }
    }
    
}
