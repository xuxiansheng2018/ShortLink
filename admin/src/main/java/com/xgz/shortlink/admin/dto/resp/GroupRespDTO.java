package com.xgz.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * @Author xuguozhu
 * @Create 2024/4/12 20:01
 * Level:
 * Description:
 */
@Data
public class GroupRespDTO {

    /**
     * 分组id
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 创建分组的用户
     */
    private String username;

    /**
     * 短链接分组排序
     */
    private Integer sortOrder;
}
