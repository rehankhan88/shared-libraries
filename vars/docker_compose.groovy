def call(){
  
  sh '''
          docker stop notes-app 2>/dev/null || true
          docker rm notes-app 2>/dev/null || true
          docker compose up -d
        '''
}
