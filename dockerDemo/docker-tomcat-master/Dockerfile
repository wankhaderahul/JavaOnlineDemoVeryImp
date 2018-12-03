FROM tomcat:8.5.34-jre8-alpine

USER root
COPY tomcat-users.xml /usr/local/tomcat/conf/
COPY manager.xml /usr/local/tomcat/conf/Catalina/localhost/
COPY host-manager.xml /usr/local/tomcat/conf/Catalina/localhost/ 

CMD ["catalina.sh", "run"]