package com.xgz.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * @Author xuguozhu
 * @Create 2024/4/12 18:56
 * Level:
 * Description:
 */
@Data
public class BaseDao {
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标识  0：未删除  1：已删除
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;
}
