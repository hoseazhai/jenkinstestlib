package org.devolops

//ansible
def AnsibleDeploy(hosts,func){
    sh "ansible ${func} ${hosts}"
}
