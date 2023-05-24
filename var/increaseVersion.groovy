def call(env) {
    sh 'npm version minor'

    def packageJson = readJSON file: 'package.json'
    def version = packageJson.version

    env.NEW_VERSION = "$version-$BUILD_NUMBER"
}