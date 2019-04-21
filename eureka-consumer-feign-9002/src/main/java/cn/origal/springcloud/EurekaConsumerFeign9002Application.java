package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableEurekaClient 将当前应用加入到服务治理框架中
 * @author  A.I.
 * @date   2019/4/20 15:36
 * @version   1.0
 **/
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class EurekaConsumerFeign9002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeign9002Application.class);
    }
}
