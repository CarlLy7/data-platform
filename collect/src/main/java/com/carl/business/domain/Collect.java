package com.carl.business.domain;
/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 20:46
 * @version: 1.0
 */

import com.carl.collect.CollectWayEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 数据采集domain
 * @author: carl
 * @createDate: 2025-03-09 20:46
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collect implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 规则主键id
     */
    private Long ruleId;

    /**
     * 指标英文标识
     */
    private String enName;

    /**
     * 数据源
     */
    private String dataSource;

    /**
     * 数据采集来源 1：sql采集 2：接口采集
     * @see CollectWayEnum
     */
    private CollectWayEnum collectWay;

    /**
     * 取决于数据采集来源，如果是sql采集则标识sql脚本，如果是接口采集则标识url
     */
    private String content;

    /**
     * 是否去重
     */
    private Boolean deduplicate;

    /**
     * 统计周期格式
     */
    private String periodFormat;

}
