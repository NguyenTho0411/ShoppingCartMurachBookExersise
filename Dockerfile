# Sử dụng image Tomcat
FROM tomcat:10.0-jdk17

# Xóa các ứng dụng mặc định của Tomcat (tùy chọn)
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Sao chép file .war vào thư mục webapps
COPY target/execersiseofficalweek6-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/execersiseofficalweek6-1.0-SNAPSHOT.war

# Expose port
EXPOSE 8080

# Lệnh khởi động Tomcat
CMD ["catalina.sh", "run"]