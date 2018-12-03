STEP 1: Create directory for schema files.

$ mkdir -p ~/my-mysql/sql-scripts
$ cd ~/my-mysql/sql-scripts

STEP 2: Create CreateTable.sql File.This file contains the SQL statement to create a table called employees. We will add four columns to our table

CREATE TABLE employees (
first_name varchar(25),
last_name  varchar(25),
department varchar(15),
email  varchar(50)
);

And InsertData.sql. This file contains our statement to insert data in the table ‘employees’.

STEP 3: Create Dockerfile inside the folder

# Derived from official mysql image (our base image)
FROM mysql
# Add a database
ENV MYSQL_DATABASE company
# Add the content of the sql-scripts/ directory to your image
# All scripts in docker-entrypoint-initdb.d/ are automatically
# executed during container startup
COPY ./sql-scripts/ /docker-entrypoint-initdb.d/

STEP 4 : Build docker image

docker build -t docker-mysql .

STEP 5: Tag docker image to docker hub repository.

docker tag __imageName sureshchouksey/docker-mysql

STEP 6: Push docker image to docker hub repository.

docker push sureshchouksey/docker-mysql

STEP 7: Create docker compose file.

version: '2'

version: '2'

services:
  mysql:
    image: 'sureshchouksey/docker-mysql'
    labels:
      kompose.service.type: nodeport
    ports:
      - '3306:3306'
    volumes:
    - ./docker/data:/docker-entrypoint-initdb.d
    environment:
        MYSQL_ROOT_PASSWORD: 1234
	

STEP 8: Run docker compose file

docker-compose up -d

docker exec -it <my-mysql-container name> bash

mysql -uroot -p

mysql -h localhost -P 3306 --protocol=tcp -uroot

mysql -h 192.168.99.100 -P 3306 -u root

Ref: https://medium.com/@lvthillo/customize-your-mysql-database-in-docker-723ffd59d8fb