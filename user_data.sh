#!/bin/bash
yum update -y

sed 's/PasswordAuthentication no/PasswordAuthentication yes/' -i /etc/ssh/sshd_config
echo "1234" | passwd --stdin ec2-user
systemctl restart sshd

amazon-linux-extras install java-openjdk11 -y
wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.60/bin/apache-tomcat-9.0.60.tar.gz
tar -zvxf apache-tomcat-9.0.60.tar.gz

aws s3 cp s3://<bucket-name>/<file-name>.war /
mv /<file-name>.war /ROOT.war

rm -rf /apache-tomcat-9.0.60/webapps/*
mv /ROOT.war /apache-tomcat-9.0.60/webapps/

/apache-tomcat-9.0.60/bin/startup.sh
