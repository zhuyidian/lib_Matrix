# lib_Matrix

## 1.使用
* 1，导入依赖
```xml
implementation 'com.github.zhuyidian:lib_Matrix:V1.0.0'
```
* 2，引入插件
```xml
注：需要在app的build.gradle中引入插件(apply plugin: 'com.android.application')
apply plugin: 'com.tencent.matrix-plugin'
matrix {
    trace {
        enable = true	//if you don't want to use trace canary, set false
        baseMethodMapFile = "${project.buildDir}/matrix_output/Debug.methodmap"
        blackListFile = "${project.projectDir}/matrixTrace/blackMethodList.txt"
    }
} 
```
* 3，版本问题
```xml
app的 minSdkVersion 最低需要21
```
