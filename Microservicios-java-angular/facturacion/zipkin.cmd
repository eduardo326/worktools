@echo off

set RABBIT_ADDRESSES=localhost:5672
set STORAGE_TYPE=mysql
set MYSQL_USER=root
set MYSQL_PASS=
set MYSQL_HOST=localhost
set MYSQL_TCP_PORT=3306
java -jar ./zipkin-server-2.21.7-exec.jar