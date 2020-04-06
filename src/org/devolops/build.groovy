package org.devolops

//构建类型
def Build(buildTYpe, buildShell){
    def buildTools = ["maven":"maven,"gradle":"gradle","npm":"npm]
    buildHome = tool buildTools[buildType]
    
    println("当前选择的构建类型为 ${buildType}")
    
}
    
