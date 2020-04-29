package com.tai.feign.feign;

import com.tai.feign.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @Author gaoming
* @Description 声明要调用的微服务名称
 *  @FeignClient(name="微服务名称")
**/
@FeignClient(name="eureka-client-example1")
public interface FeignClientInterface {

    /**
    * @Author gaoming
    * @Description 配置需要调用的微服务接口
    **/
    @RequestMapping(value = "/user/query",method = RequestMethod.GET)
    User getUserByName(@RequestParam String name);
}
