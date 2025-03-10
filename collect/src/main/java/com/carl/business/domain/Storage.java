package com.carl.business.domain;

import com.carl.business.constants.SymbolConstants;
import com.carl.collect.DimensionEnum;
import com.carl.collect.PeriodEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
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

    public String getTableName(String ruleCnName, DimensionEnum dimensionEnum, PeriodEnum periodEnum) {
        return getDefaultTableName(ruleCnName, dimensionEnum, periodEnum);
    }

    public String getTableName(String ruleCnName, DimensionEnum dimensionEnum, String suffix) {
        return new StringBuilder(DEFAULT_TABLE_PREFIX)
                .append(SymbolConstants.UNDERLINE)
                .append(ruleCnName)
                .append(SymbolConstants.UNDERLINE)
                .append(dimensionEnum.getValue().toLowerCase())
                .append(suffix)
                .toString();
    }

    /**
     * 获取默认的表名
     *
     * @param ruleCnName
     * @param dimensionEnum
     * @param periodEnum
     * @return
     */
    public static String getDefaultTableName(String ruleCnName, DimensionEnum dimensionEnum, PeriodEnum periodEnum) {
        return doGetTableName(ruleCnName, dimensionEnum, periodEnum, DEFAULT_TABLE_PREFIX);
    }

    /**
     * 获取表名字
     *
     * @param ruleEnName
     * @param dimensionEnum
     * @param periodEnum
     * @param tablePrefix
     * @return
     */
    private static String doGetTableName(String ruleEnName, DimensionEnum dimensionEnum, PeriodEnum periodEnum, String tablePrefix) {
        String suffix = (Objects.equals(periodEnum, PeriodEnum.DAY) || Objects.equals(periodEnum, PeriodEnum.CUSTOM)) ? DEFAULT_DAY_SUFFIX : DEFAULT_NOT_DAY_SUFFIX;
        StringBuilder tableName = new StringBuilder();
        tableName.append(tablePrefix).append(SymbolConstants.UNDERLINE).append(ruleEnName).append(SymbolConstants.UNDERLINE).append(dimensionEnum.getValue().toLowerCase()).append(suffix);
        return tableName.toString();
    }

}