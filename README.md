# lib_Matrix

## 1.使用
* 1，导入依赖
```xml
第一步：
在gradle.properties中添加matrix版本 
MATRIX_VERSION=2.0.5
第二步：
在工程根目录的build.gradle中添加matrix地址，主要matrix插件需要使用
classpath ("com.tencent.matrix:matrix-gradle-plugin:${MATRIX_VERSION}") { changing = true }
第三步：
引入插件
注：需要在app的build.gradle中引入插件(apply plugin: 'com.android.application')
apply plugin: 'com.tencent.matrix-plugin'
matrix {
    trace {
        enable = true	//if you don't want to use trace canary, set false
        baseMethodMapFile = "${project.buildDir}/matrix_output/Debug.methodmap"
        blackListFile = "${project.projectDir}/matrixTrace/blackMethodList.txt"
    }
} 
第四步：
需要过滤掉多余的so
在app的build.gradle中的android闭包中添加
packagingOptions {
    pickFirst 'lib/armeabi-v7a/libc++_shared.so'
    pickFirst 'lib/arm64-v8a/libc++_shared.so'
    pickFirst 'lib/armeabi-v7a/libwechatbacktrace.so'
    pickFirst 'lib/arm64-v8a/libwechatbacktrace.so'
}
第五步：
导入依赖
在root build.gradle中添加
classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:2.0.8'
在使用matrix sdk的module中的build.gradle中添加
apply plugin: 'android-aspectjx'
implementation 'com.github.zhuyidian:lib_Matrix:V1.0.0'
```

* 2，版本问题
```xml
app的 minSdkVersion 最低需要21
```

* 3，代码处理
```xml
需要集成或者使用 MatrixApplication
```

* 4，生成分析文件
```xml
会在app的build/outputs/mapping目录中生成
methodMapping.txt和ignoreMethodMapping.txt文件
```
