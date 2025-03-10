package com.carl.business.domain;

import com.carl.collect.CollectWayEnum;

import java.io.Serializable;

/**
 * 数据组织domain
 */

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public CollectWayEnum getCollectWay() {
        return collectWay;
    }

    public void setCollectWay(CollectWayEnum collectWay) {
        this.collectWay = collectWay;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String toString() {
        return "Organ{" +
                "id=" + id +
                ", ruleId=" + ruleId +
                ", collectWay=" + collectWay +
                ", content='" + content + '\'' +
                ", dataSource='" + dataSource + '\'' +
                '}';
    }
}