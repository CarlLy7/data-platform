package com.carl.business.domain;

import com.carl.collect.DimensionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Optional;

/**
 * 数据存储domain
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage implements Serializable {
    /**
     * 默认表前缀
     */
    private static final String DEFAULT_TABLE_PREFIX = "t_generate_";

    /**
     * 默认数据源
     */
    private static final String DEFAULT_DATASOURCE = "data-center";

    /**
     * 天维度的表后缀
     */
    private static final String DEFAULT_DAY_SUFFIX = "day";

    /**
     * 除天维度的表后缀
     */
    private static final String DEFAULT_NOT_DAY_SUFFIX = "statistics";


    /**
     * 主键
     */
    private Long id;

    /**
     * 规则id
     */
    private Long ruleId;

    /**
     * 数据指标的数据源
     */
    private String dataSource;

    /**
     * 自动生成表前缀，生成规则为t_generate_{en_name}_{dimension}_{date}
     */
    private String tablePrefix;


    /**
     * 状态 1：未删除 0：删除
     */
    private Integer status;

    public String getTablePrefix() {
        return Optional.ofNullable(tablePrefix).orElse(DEFAULT_TABLE_PREFIX);
    }

    public static Storage defaultStorage() {
        Storage storage = new Storage();
        storage.setDataSource(DEFAULT_DATASOURCE);
        storage.setTablePrefix(DEFAULT_TABLE_PREFIX);
        return storage;
    }

    private String doGetTableName(String ruleEnName, DimensionEnum dimensionEnum){
        return "";
    }

}