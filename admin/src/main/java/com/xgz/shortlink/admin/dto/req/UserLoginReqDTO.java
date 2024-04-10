package com.xgz.shortlink.admin.dto.req;

/**
 * @Author xuguozhu
 * @Create 2024/4/10 13:46
 * Level:
 * Description:
 */

import lombok.Data;

/**
 * 用户登录接口请求参数
 */
@Data
public class UserLoginReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
