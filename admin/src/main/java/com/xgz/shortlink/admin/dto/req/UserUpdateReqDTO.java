package com.xgz.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author xuguozhu
 * @Create 2024/4/8 20:00
 * Level:
 * Description:
 */

/**
 * 用户更新
 */
@Data
public class UserUpdateReqDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;
}
