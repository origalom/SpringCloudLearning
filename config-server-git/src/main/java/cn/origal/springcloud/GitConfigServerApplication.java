package cn.origal.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *  @EnableConfigServer：开启spring cloud config服务端功能
 * @author  A.I.
 * @date   2019/4/21 22:07
 * @version   1.0
 **/
@EnableConfigServer
@SpringBootApplication
public class GitConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitConfigServerApplication.class);
    }
}
