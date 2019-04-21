package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  eureka服务注册中心启动程序
 *  @EnableEurekaServer： 启动一个服务注册中心
 * @author  A.I.
 * @date   2019/4/17 22:32
 * @version   1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7000.class);
    }
}
