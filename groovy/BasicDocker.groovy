import groovy.json.JsonSlurper

String filePath = "/home/groovy/scripts/users.json"
def jsonSlurper = new JsonSlurper()

ArrayList data = jsonSlurper.parse(new File(filePath))

for (user: data) {
    println(user.name)

    for (role: user.roles) {
        println('\t' + role)
    }
}

