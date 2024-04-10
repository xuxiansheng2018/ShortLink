package com.xgz.shortlink.admin.common.constant;

/**
 * @Author xuguozhu
 * @Create 2024/4/9 18:27
 * Level:
 * Description:
 */

/**
 * 短链接 后管 Redis 缓存常量
 */
public class RedisCacheConstant {

    /**
     * 分布式锁 key
     */
    public final static String LOCK_USER_REGISTER_KEY = "short-link:lock_user_register:";

    /**
     * UUID key
     */
    public final static String USER_LOGIN_UUID_KEY = "short-link:user_login:uuid:";
    /**
     * token 30分钟有效期
     */
    public final static Long USER_LOGIN_UUID_TTL = 30L;

    /**
     * 登录用户key
     */
    public final static String USER_LOGIN_USERNAME_KEY = "short-link:user_login:username:";
}
