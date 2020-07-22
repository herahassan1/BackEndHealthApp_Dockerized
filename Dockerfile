FROM bitnami/tomcat:9.0
COPY /target/HealthApp-1.0.war /opt/bitnami/tomcat/webapps_default