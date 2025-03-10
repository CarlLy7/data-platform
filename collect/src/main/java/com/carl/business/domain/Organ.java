package com.carl.business.domain;

import com.carl.collect.CollectWayEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 数据组织domain
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organ implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 规则id
     */
    private Long ruleId;

    /**
     * 抽取方式，1：sql抽取 2：接口抽取
     * @see CollectWayEnum
     */
    private CollectWayEnum collectWay;

    /**
     * 抽取组织方式，如果collect_way=1则表示sql脚本，如果collect_way=2则表示url
     */
    private String content;

    /**
     * 数据抽取组织数据源
     */
    private String dataSource;

}