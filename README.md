## Introduction

基于[jeecg-boot](https://github.com/zhangdaiscott/jeecg-boot)封装的`spring-boot-starter`,
可用于快速开发，享受`jeecg-boot`的所有功能，且升级内核业务无感知！

(不定期同步其源码，力求始终为最新的稳定版本，当前版本`2.2.1`)

## Feature

- [x] 平滑升级，业务无感知
- [x] 共享`jeecg-boot`的后端的所有功能
- [x] 可直接使用`jeecg-boot`的前端进行访问
- [x] 适用人群
	-  快速开发人群
	-  不需对`jeecg-boot`的源代码进行改动的人群
	-  只需对`jeecg-boot`配置项进行调整即可满足开发的人群

## Maven Dependency

在项目的pom.xml的dependencies中加入以下内容:
```xml
<dependency>
    <groupId>com.itplh.opensource</groupId>
    <artifactId>jeecg-spring-boot-starter</artifactId>
    <version>2.2.1</version>
</dependency>
```

## Usage

参考[jeecg-spring-boot-starter-test](https://github.com/tanpenggood/jeecg-spring-boot-starter-test)

1. 新建`spring boot`项目
2. 引入依赖`jeecg-spring-boot-starter`
    ```xml
    <dependency>
        <groupId>com.itplh.opensource</groupId>
        <artifactId>jeecg-spring-boot-starter</artifactId>
        <version>2.2.1</version>
    </dependency>
    ```
3. 相关类
    - org.jeecg.JeecgApplication
    - org.jeecg.JeecgOneGUI
    - org.jeecg.JeecgOneToMainUtil
4. 相关资源
    ```
    resources
        jeecg
        static
        templates
        application.yml
        application-dev.yml
        application-prod.yml
        application-test.yml
        banner.txt
        logback-spring.xml
    ```
5. 启动项目，使用[jeectboot的前端](https://github.com/zhangdaiscott/jeecg-boot/tree/master/ant-design-vue-jeecg)访问

## Thanks

[jeecg-boot](https://github.com/zhangdaiscott/jeecg-boot)
