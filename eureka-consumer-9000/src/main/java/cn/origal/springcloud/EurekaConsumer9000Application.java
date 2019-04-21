package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *  RestTemplate： 可以通过RestTemplate发送rest请求
 * @EnableEurekaClient 将当前应用加入到服务治理框架中，仅适用于eureka注册中心
 * @EnableDiscoveryClient 将当前应用加入到服务治理框架中，，适用于不同的注册中心：eureka，consul, zookeeper
 * @author  A.I.
 * @date   2019/4/20 15:36
 * @version   1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumer9000Application {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer9000Application.class);
    }
}
