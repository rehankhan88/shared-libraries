// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
  // sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  sh '''#!/bin/bash
      set -euo pipefail
      # ensure .dockerignore exists to avoid sending DB files
      docker build -t notes-app:latest .
      docker image ls --format '{{.Repository}}:{{.Tag}}' | grep -q '^notes-app:latest$'
    '''
}
