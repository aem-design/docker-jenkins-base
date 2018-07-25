import jenkins.model.*

def env = System.getenv()
def JENKINS_SLAVE_COUNT = env['JENKINS_SLAVE_COUNT'].toString()
def slavescount = JENKINS_SLAVE_COUNT.toInteger() ? JENKINS_SLAVE_COUNT.toInteger() : 2

Jenkins.instance.setNumExecutors(slavescount)