package com.xgz.shortlink.admin.dto.resp;

import lombok.Data;

import java.util.Date;

/**
 * @Author xuguozhu
 * @Create 2024/4/7 16:27
 * Level:
 * Description:
 */
@Data
public class UserRespDTO {
    /**
     * ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

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

    /**
     * 注销时间戳
     */
    private Long deletionTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除标识  0：未删除  1：已删除
     */
    private Integer delFlag;
}



