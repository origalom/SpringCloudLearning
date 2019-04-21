package cn.origal.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  直接通过地址访问时，请求地址为：http://{spring.application.name}
 * @author  A.I.
 * @date   2019/4/21 9:00
 * @version   1.0
 **/
@RestController
public class Test {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test/hello")
    public String hello() {
        return restTemplate.getForObject("http://eureka-client-8000/test/hello", String.class);
    }
}
