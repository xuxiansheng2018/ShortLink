package com.xgz.shortlink.admin.config;

/**
 * @Author xuguozhu
 * @Create 2024/4/12 14:54
 * Level:
 * Description:
 */


import com.xgz.shortlink.admin.biz.user.UserTransFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * 用户配置自动装配
// */
//@Configuration
//@Component
//public class UserConfiguration {
//    /**
//     * 用户信息传递过滤器
//     */
//    @Bean
//    public FilterRegistrationBean<UserTransFilter> globalUserTransFilter() {
//        FilterRegistrationBean<UserTransFilter> registration = new FilterRegistrationBean<>();
//        registration.setFilter(new UserTransFilter());
//        registration.addUrlPatterns("/*");
//        registration.setOrder(0);
//
//        return registration;
//    }
//}


@Configuration
public class UserConfiguration {
    /**
     * 用户信息传递过滤器
     */
    @Bean
    // TODO: 2024/4/12  这里为什么要传入stringRedis  并且 为什么只能使用构造方法注入
    public FilterRegistrationBean<UserTransFilter> globalUserTransFilter(StringRedisTemplate stringRedisTemplate) {
        FilterRegistrationBean<UserTransFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new UserTransFilter(stringRedisTemplate));
        registration.addUrlPatterns("/*");
        registration.setOrder(0);
        return registration;
    }
}
