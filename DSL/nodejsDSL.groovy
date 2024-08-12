job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/kellystephany24/nodejsapp-1.git', 'master') { node ->
            node / gitConfigName('kellystephany24')
            node / gitConfigEmail('kellystephany24@yahoo.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
