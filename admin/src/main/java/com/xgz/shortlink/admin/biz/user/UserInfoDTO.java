package com.xgz.shortlink.admin.biz.user;

/**
 * @Author xuguozhu
 * @Create 2024/4/12 14:17
 * Level:
 * Description:
 */

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDTO {
    /**
     * 用户 ID
     */
    @JSONField(name = "id")
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

}