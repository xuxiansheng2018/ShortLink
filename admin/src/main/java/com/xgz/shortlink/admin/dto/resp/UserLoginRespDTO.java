package com.xgz.shortlink.admin.dto.resp;

/**
 * @Author xuguozhu
 * @Create 2024/4/10 13:46
 * Level:
 * Description:
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录接口返回响应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRespDTO {
    /**
     * 用户登录token
     */
    private String token;
}
