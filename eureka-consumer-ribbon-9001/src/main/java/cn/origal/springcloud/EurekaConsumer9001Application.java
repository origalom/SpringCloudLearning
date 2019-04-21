package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *  RestTemplate： 可以通过RestTemplate发送rest请求
 * @EnableEurekaClient 将当前应用加入到服务治理框架中
 * @LoadBalanced
 * @author  A.I.
 * @date   2019/4/20 15:36
 * @version   1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumer9001Application {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumer9001Application.class);
    }
}
