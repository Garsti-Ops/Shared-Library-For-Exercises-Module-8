def call(username, password, new_version) {
    sh 'docker build . -t garstiops/garstiges-secret-repo:node-app-${new_version}'
    sh 'echo ${password} | docker login -u ${username} --password-stdin'
    sh 'docker push garstiops/garstiges-secret-repo:node-app-${new_version}'
}