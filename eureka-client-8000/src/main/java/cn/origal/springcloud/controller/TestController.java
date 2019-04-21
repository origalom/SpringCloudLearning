package cn.origal.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test/hello")
    public String hello() {
        return "client 8000 say hello";
    }

}
