package com.carl.business.domain;

import com.carl.collect.RuleTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 数据规则domain
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rule implements Serializable {
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

    /**
     * 创建时间
     */

    /**
     * 状态 1：未删除 0：删除
     */
    private Integer status;
}