package com.carl.business.domain;

import com.carl.collect.RuleTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 数据规则domain
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rule implements Serializable {

    /**
     * 数据计算
     */
    private List<Calculate> calculates;

    /**
     * 数据组织
     */
    private List<Organ> organs;

    /**
     * 数据采集
     */
    private List<Collect> collects;

    /**
     * 元数据
     */
    private List<Metadata> metadata;

    /**
     * 数据存储
     */
    private Storage storage;

    /**
     * 主键
     */
    private Long id;

    /**
     * 业务id,为了兼容不同的主键规则，设计为varchar类型
     */
    private String businessId;

    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 业务英文标识
     */
    private String enName;

    /**
     * 业务规则名称
     */
    private String ruleName;

    /**
     * 业务规则类型，兼容采集规则，查询规则
     * @see RuleTypeEnum
     */
    private RuleTypeEnum ruleType;

    /**
     * 版本号，如果规则变更了，直接生成一个新的规则更新版本号
     */
    private String version;

}