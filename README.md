# lib_Matrix

## 1.使用
* 1，导入依赖
implementation 'com.github.zhuyidian:lib_Matrix:V1.0.0'
* 2，引入插件
apply plugin: 'com.tencent.matrix-plugin'
matrix {
    trace {
        enable = true	//if you don't want to use trace canary, set false
        baseMethodMapFile = "${project.buildDir}/matrix_output/Debug.methodmap"
        blackListFile = "${project.projectDir}/matrixTrace/blackMethodList.txt"
    }
} 
* 3，初始化
```xml
//将native和java层的异常信息全部抛到java层的onCrash方法
NativeCrashMonitor nativeCrashMonitor = new NativeCrashMonitor();
  nativeCrashMonitor.init(new CrashHandlerListener() {
      @Override
      public void onCrash(String threadName, Error error) {

      }
});
```
* 4，测试native崩溃
```xml
NativeCrashMonitor.nativeCrash();
```
