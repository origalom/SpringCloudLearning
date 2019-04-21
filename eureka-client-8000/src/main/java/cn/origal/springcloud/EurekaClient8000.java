package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  eureka服务提供客户端
 *  @EnableEurekaClient： 表示该工程为eureka服务客户端
 * @author  A.I.
 * @date   2019/4/17 22:55
 * @version   1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient8000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient8000.class);
    }
}
