package springcloud.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  创建feign客户端接口定义
 *  @FeignClient： 指定这个接口要调用的服务名称，对应服务提供者的${spring.application.name}
 *  接口中定义的各个函数适用mvc的注解来绑定服务提供方的rest接口
 * @author  A.I.
 * @date   2019/4/21 12:15
 * @version   1.0
 **/
@FeignClient("eureka-client-8000")
public interface HelloClient {

    @GetMapping("/test/hello")
    String getHello();
}
