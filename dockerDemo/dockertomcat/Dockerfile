FROM tomcat:8.5.34-jre8-alpine

COPY /websocket-demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/myapp.war

CMD ["catalina.sh", "run"]


##COPY /websocket-demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/


######## commands docker image build -t dockertomcat .     -->  docker run -it --rm -p 8888:8080 tomcat:8.0