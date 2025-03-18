#!/bin/bash
sudo su -
yum update -y
yum install httpd -y
yum install git -y
service httpd start
chkconfig httpd on
git clone https://github.com/ARAVINDTrainings/Swiggy.git /var/www/html

