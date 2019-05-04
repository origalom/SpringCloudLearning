package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableEurekaClient 将当前应用加入到服务治理框架中
 * @EnableCircuitBreaker 启动熔断器的使用，自动判断当前使用的是哪个熔断器
 * @EnableHystrix 启动hystix的使用
 * @SpringCloudApplication： 该注解可以代替@SpringBootApplication @EnableCircuitBreaker @EnableDiscoveryClient三个注解
 * @author  A.I.
 * @date   2019/4/20 15:36
 * @version   1.0
 **/
@EnableFeignClients
//@EnableHystrix
//@EnableDiscoveryClient
//@EnableCircuitBreaker
//@SpringBootApplication
@SpringCloudApplication
public class EurekaConsumerFeignHystrix9003Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerFeignHystrix9003Application.class);
    }
}
