package cn.origal.springcloud.controller;

import cn.origal.springcloud.clients.HelloClient;
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
    private HelloClient helloClient;

    @RequestMapping("/test/hello")
    public String hello() {
        return helloClient.getHello();
    }
}
