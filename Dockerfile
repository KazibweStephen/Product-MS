FROM openjdk:11
#RUN addgroup -S spring && spring -S spring -G spring
#USER spring:spring
MAINTAINER kstephen3@gmail.com
copy target/productsms-0.0.1-SNAPSHOT.jar productsms-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","productsms-0.0.1-SNAPSHOT.jar"]