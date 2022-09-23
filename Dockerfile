FROM openjdk:17-alpine
 
 # Refer to Maven build -> finalName
 ARG JAR_FILE=target/devops-sample-0.0.1-SNAPSHOT.jar
 
 # cd /opt/app
 WORKDIR /opt/app
 
 # cp target/{jarfileName}.jar /opt/app/app.jar
 #COPY ${JAR_FILE} app.jar
 COPY target/devops-sample-0.0.1-SNAPSHOT.jar app.jar
 
 # java -jar /opt/app/app.jar
 ENTRYPOINT ["java","-jar","app.jar"]