package cn.origal.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  LoadBalancerClient：获取服务治理体系上的负载均衡客户端
 *  获取客户端时根据客户端的serviceId进行获取，即配置文件中的spring.application.name的值
 * @author  A.I.
 * @date   2019/4/21 9:00
 * @version   1.0
 **/
@RestController
public class Test {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test/hello")
    public String hello() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client-8000");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/test/hello";
        System.out.println(url);

        return restTemplate.getForObject(url, String.class);
    }
}
