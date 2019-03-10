## 这是一个基于SpringBoot的rest service 项目

参考自：https://spring.io/guides/gs/rest-service/#scratch

## 简单介绍
 + 先创建一个pom.xml文件, 添加依赖
    + 最小依赖是
        + 设置parent为spring-boot-starter-parent
        + 依赖 spring-boot-starter-web
    + maven插件
        + spring-boot-maven-plugin是支持以maven的命令打包/运行springboot的应用
        + 详细介绍 https://www.cnblogs.com/liaojie970/p/9007577.htm
        
 + 实体类 Greeting，简单的pojo类
 + controller GreetingController
    + 添加注解@RestController
    + 针对方法的路径设置注解@RequestMapping
    + 方法的返回就是Response，如果返回的是个对象，就会将该对象序列化为json返回
 + 启动类 Start
    + 包含main()方法
    + 添加类注解@SpringBootApplication
    + 通过SpringApplication.run(Start.class, args);启动
    
 