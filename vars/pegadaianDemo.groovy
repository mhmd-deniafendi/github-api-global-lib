def tfVars() {
    def createFile = sh 'echo "Hello-Worl" > ${env.WORKSPACE}'
    echo("${createFile}")
}

