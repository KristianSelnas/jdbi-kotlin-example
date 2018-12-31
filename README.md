# JDBI Java example
An example illustrating that JDBI fails when using Kotlin.

This project is as identical as possible to to the [Java version](https://github.com/KristianSelnas/jdbi-java-example), which works like a charm.

It fails with the following exception:
```
org.jdbi.v3.core.extension.NoSuchExtensionException: Extension not found: interface com.example.demo.repository.ThingDao
	at org.jdbi.v3.core.Jdbi.lambda$withExtension$9(Jdbi.java:437) ~[jdbi3-core-3.3.0.jar:3.3.0]
	at java.util.Optional.orElseThrow(Optional.java:290) ~[na:1.8.0_111]
	at org.jdbi.v3.core.Jdbi.withExtension(Jdbi.java:437) ~[jdbi3-core-3.3.0.jar:3.3.0]
	at com.example.demo.repository.ThingRepository.getThings(ThingRepository.kt:11) ~[classes/:na]
	at com.example.demo.api.ThingController.things(ThingController.kt:12) ~[classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_111]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_111]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_111]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_111]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:189) ~[spring-web-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138) ~[spring-web-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:102) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:800) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1038) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:942) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1005) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:897) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:634) ~[tomcat-embed-core-9.0.13.jar:9.0.13]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:882) ~[spring-webmvc-5.1.3.RELEASE.jar:5.1.3.RELEASE]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:741) ~[tomcat-embed-core-9.0.13.jar:9.0.13]
```