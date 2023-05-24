def call(username, password, branchName) {
    sh 'git config --global user.email "jenkins@example.com"'
    sh 'git config --global user.name "jenkins"'

    sh "git remote set-url origin https://${username}:${password}@github.com/Garsti-Ops/Dev-Ops-Bootcamp-Exercises-Module-8.git"
    sh 'git add .'
    sh 'git commit -m "ci: version increment"'
    sh 'git push origin HEAD:${branchName}'
}