FROM mcr.microsoft.com/java/tomcat:8-zulu-alpine-tomcat-9
RUN rm -fr /usr/local/tomcat/webapps/ROOT
COPY target/demo-02.war /usr/local/tomcat/webapps/ROOT.war
