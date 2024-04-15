package com.xgz.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @Author xuguozhu
 * @Create 2024/4/15 19:58
 * Level:
 * Description:
 */
@Data
public class GroupSortReqDTO {
    /**
     * 分组id
     */
    private String gid;
    /**
     * p
     */
    private Integer sortOrder;
}
