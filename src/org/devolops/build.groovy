package org.devolops

//构建类型
def Build(buildType, buildShell){
    def buildTools = ["mvn":"maven","gradle":"gradle","npm":"npm"]
    buildHome = tool buildTools[buildType]
    
    println("当前选择的构建类型为 ${buildType}")
    
    sh "${buildHome}/bin/${buildtype} ${buildShell}"
    
}
    
