# 클라우드 컴퓨팅 지방기능경기대회 제 1과제 Apache Tomcat 예제 코드

## Architecture
![image](https://user-images.githubusercontent.com/77256585/159214736-31253d36-ee59-4817-a6ce-2d4618d9d83b.png)

## Language/Framework

#### Java/Spring Boot(Gradle)
#### Service_A port : 8080
#### Service_B port : 8080
#### Health check path : /health
#### Route 53 Domain Name : cloud.skills.com

## How to install Apache Tomcat

Install Apache Tomcat using this command
```
amazon-linux-extras install java-openjdk11 -y
wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.60/bin/apache-tomcat-9.0.60.tar.gz
tar -zvxf apache-tomcat-9.0.60.tar.gz
```

## How to Run Web Application Server with Apache Tomcat and WAR File

Clone the appropriate branch for each EC2 instance
```
git clone https://github.com/Jeromy0515/cloud-skills-sample-apache-tomcat-msa.git -b <service-a or service-b>
```

Move `.war` file in the directory cloned above -> `/apache-tomcat-9.0.60/webapps`

Configure `/apache-tomcat-9.0.60/conf/server.xml` file like this
```
<Host name="localhost"  appBase="webapps" unpackWARs="true" autoDeploy="true">
    <Context path="/" docBase="<war-file-name(skip .war)>" reloadable="true" /> <!-- add here -->
    <!-- SingleSignOn valve, share authentication between web applications
        Documentation at: /docs/config/valve.html -->
    <!--
        <Valve className="org.apache.catalina.authenticator.SingleSignOn" />
    -->
 
       <!-- Access log processes all example.
         Documentation at: /docs/config/valve.html
         Note: The pattern used is equivalent to using pattern="common" -->
    <Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs" prefix="localhost_access_log" suffix=".txt" pattern="%h %l %u %t &quot;%r&quot; %s %b" />
</Host>
```

Start application by executing `/apache-tomcat-9.0.60/bin/startup.sh`

If you restart application, execute `/apache-tomcat-9.0.60/bin/shutdown.sh` and execute `/apache-tomcat-9.0.60/bin/startup.sh`
