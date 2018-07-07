FROM maven:3.3.3

## 复制文件， 以 / 结尾，则复制文件
ADD pom.xml /tmp/build/
RUN cd /tmp/build && mvn -q dependency:resolve

## 复制文件 , 不以/ 结尾，则将 src 所有内容 复制到 src
ADD src /tmp/build/src

#构建应用
RUN cd /tmp/build && mvn -q -DskipTests=true package \
        #拷贝编译结果到指定目录
        && mv target/*.jar /app.jar \
        #清理编译痕迹
        && cd / && rm -rf /tmp/build

VOLUME /tmp
EXPOSE 8080

# java.security.egd 设置指定的随机数发生器
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]