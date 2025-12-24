FROM tomcat:9.0
# Copy WAR as ROOT.war for root context
COPY webapp/target/webapp.war /usr/local/tomcat/webapps/ROOT.war
