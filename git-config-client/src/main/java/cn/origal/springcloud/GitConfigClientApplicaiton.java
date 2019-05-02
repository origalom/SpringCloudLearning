package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author  A.I.
 * @date   2019/4/21 22:48
 * @version   1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class GitConfigClientApplicaiton {

    public static void main(String[] args) {
        SpringApplication.run(GitConfigClientApplicaiton.class);
    }
}
