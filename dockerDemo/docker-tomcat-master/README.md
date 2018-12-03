STEP 1:First Create Dockerfile inside the folder.

FROM tomcat:8.5.34-jre8-alpine

USER root
COPY tomcat-users.xml /usr/local/tomcat/conf/
COPY manager.xml /usr/local/tomcat/conf/Catalina/localhost/
COPY host-manager.xml /usr/local/tomcat/conf/Catalina/localhost/ 

CMD ["catalina.sh", "run"]

STEP 2 : Build docker image

docker build -t centostomcat .

STEP 3: Tag docker image to docker hub repository.

docker tag __imageName sureshchouksey/centostomcat

STEP 4: Push docker image to docker hub repository.

docker push sureshchouksey/centostomcat

STEP 5: Create docker compose file.

version: '2'

services:
  tomcat:
    image: 'sureshchouksey/centostomcat'
    labels:
      kompose.service.type: nodeport
    ports:
      - '8080:8080'
    volumes:
      - /path/to/tomcat-persistence:/bitnami
    environment:
      - TOMCAT_USERNAME=admin
      - TOMCAT_PASSWORD=admin

volumes:
  tomcat_data:
    driver: local
	

STEP 6: Run docker compose file

docker-compose up -d
