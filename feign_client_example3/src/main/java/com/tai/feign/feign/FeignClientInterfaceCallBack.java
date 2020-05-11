package com.tai.feign.feign;

import com.tai.feign.domain.User;
import org.springframework.stereotype.Component;

/**
 * @auther gaoming
 * @create 2020/5/7
 * @Description Fegin调用接口实现类  就是熔断触发的降级逻辑
 */
@Component
public class FeignClientInterfaceCallBack implements FeignClientInterface {
    /**
    * @Author gaoming
    * @Description  熔断降级方法
    * @return com.tai.feign.domain.User
    **/
    @Override
    public User getUserByName(String name) {
        User user = new User();
        user.setName("Fegin调用触发熔断降级方法");
        return user;
    }
}
