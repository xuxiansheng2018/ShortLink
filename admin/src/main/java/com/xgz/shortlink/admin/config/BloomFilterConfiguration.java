package com.xgz.shortlink.admin.config;

import cn.hutool.core.util.StrUtil;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author xuguozhu
 * @Create 2024/4/8 19:28
 * Level:
 * Description:
 */

/**
 * 布隆过滤器
 */
@Configuration
public class BloomFilterConfiguration {
    @Bean
    public RBloomFilter<String> userRegisterCachePenetrationBloomFilter(RedissonClient redissonClient) {
        RBloomFilter<String> cachePenetrationBloomFilter = redissonClient.getBloomFilter("userRegisterCachePenetrationBloomFilter");
        //1亿个元素  0.001%的误判率
        cachePenetrationBloomFilter.tryInit(100000000, 0.001);
        return cachePenetrationBloomFilter;

    }
}
