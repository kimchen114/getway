package com.example.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import com.example.gateway.config.PreAuthFilter;


@SpringCloudApplication 
@EnableZuulProxy
//@EnableFeignClients
public class GatewayApplication {


    public static void main(String[] args) {
//        SpringApplication.run(GatewayApplication.class, args);
        new SpringApplicationBuilder(GatewayApplication.class).web(true).run(args);
    }



    @LoadBalanced
    @Primary
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }

    @Bean
    public PreAuthFilter preAuthFilter() {
        return new PreAuthFilter();
    }
}
