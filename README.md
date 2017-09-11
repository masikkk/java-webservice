Java发布和调用webservice实例，包括原生JAX-WS发布和调用webservice，以及第三方cxf发布和调用webservice

本项目是一个maven多模块项目，简介如下：
- **jws项目**：多模块maven项目的父项目，不含任何代码，只在pom中规定各子模块依赖项的版本号
- **jws-server项目**：webservice服务发布端，包含3个包：
 - com.masikkk.jws.server.simple包，发布HelloService，提供最简单的参数和返回值都是字符串的方法
 - com.masikkk.jws.server.bean包，发布StudentService，参数和返回值都是类对象，参数为StudentRequest类，返回值为StudentResponse类
 - com.masikkk.jws.server.json包，发布JsonService，参数和返回值都是json字符串，对应Group类，方法中会做参数的反序列化和返回结果序列化。通过json串传参和返回是实际项目中最常用的方法。
- **jws-client项目**：wsimport生成的webservice调用客户端，包含src/main/java中3个包和一个测试包：
 - com.masikkk.jws.client.simple包，HelloService服务的客户端代码
 - com.masikkk.jws.client.bean包，StudentService服务的客户端代码
 - com.masikkk.jws.client.json包，JsonService服务的客户端代码
 - com.masikkk.jws.client包，包含3个webservice的客户端代码的JUnit测试类

运行方法
以HelloService为例，首先在jws-server项目中HelloServiceMain服务发布类上Run As->Java Application启动服务端确保webservice是可访问的，然后在jws-client项目中HelloServiceTest测试类上Run As->JUnit Test执行测试类，查看控制台输出结果。
