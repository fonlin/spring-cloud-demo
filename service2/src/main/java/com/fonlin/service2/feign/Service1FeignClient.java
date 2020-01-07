package com.fonlin.service2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fonlin
 */
@FeignClient(value = "service1-service", path = "service1")
public interface Service1FeignClient {

    @RequestMapping("/hello")
    String hello();
}
