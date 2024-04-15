package com.xgz.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author xuguozhu
 * @Create 2024/4/8 20:00
 * Level:
 * Description:
 */

/**
 *  修改短链接分组
 */
@Data
public class GroupUpdateReqDTO {

    /**
     * 分组id
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;
}
