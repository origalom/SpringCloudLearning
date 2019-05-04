package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.clients.HelloClient;

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

    /**
     *  fallbackMethod 指定方法错误时的方法调用
     * @return
     */
    @RequestMapping("/test/hello")
    @HystrixCommand(fallbackMethod = "fallback")
    public String hello() {
        return helloClient.getHello();
    }

    public String fallback() {
        return "fallback";
    }
}
