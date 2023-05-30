package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@LoadBalancerClient(name="provider-server", configuration = CustomLoadBalancedConfig.class)
@SpringBootApplication
@EnableFeignClients
public class ConsumerApplication12000 {

    //    //2020版开始，没有ribbon了，使用spring-cloud
//    @LoadBalanced
//    @Bean
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication12000.class, args);
    }
}
