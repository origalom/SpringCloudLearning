package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @EnableTurbine 启动监控数据聚合功能
 * @author  A.I.
 * @date   2019/5/4 14:02
 * @version   1.0
 **/
@SpringCloudApplication
@EnableTurbine
public class TurbineApplication9005 {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication9005.class);
    }
}
