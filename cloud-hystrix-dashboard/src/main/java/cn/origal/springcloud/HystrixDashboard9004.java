package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 *  @EnableHystrixDashboard 启动hystrix dashboard功能
 * @author  A.I.
 * @date   2019/5/4 12:57
 * @version   1.0
 **/
@SpringCloudApplication
@EnableHystrixDashboard
public class HystrixDashboard9004 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9004.class);
    }

}
