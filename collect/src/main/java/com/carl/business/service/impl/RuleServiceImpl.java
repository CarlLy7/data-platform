package com.carl.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.carl.business.domain.Rule;
import com.carl.business.service.RuleService;
import com.carl.infra.convert.*;
import com.carl.infra.repository.entity.*;
import com.carl.infra.repository.service.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-10 21:41
 * @version: 1.0
 */
@Service
@AllArgsConstructor
public class RuleServiceImpl implements RuleService {
    private final TDataCenterStorageService storageService;
    private final TDataCenterRuleService ruleService;

    private final TDataCenterCalculateService calculateService;

    private final TDataCenterCollectService collectService;

    private final TDataCenterMetadataService metaDataService;

    private final TDataCenterOrganService organService;

    /**
     * 根据业务id和业务规则类型 查询最新的一条数据统计规则
     *
     * @param businessId
     * @param ruleType   1:采集 2:计算
     * @return
     */
    @Override
    public Rule getRule(String businessId, String ruleType) {
        QueryWrapper<TDataCenterRule> ruleQueryWrapper = new QueryWrapper<>();
        ruleQueryWrapper.eq("business_id", businessId);
        ruleQueryWrapper.eq("rule_type", ruleType);
        ruleQueryWrapper.orderByDesc("gmt_create");
        TDataCenterRule dataCenterRule = ruleService.getOne(ruleQueryWrapper);
        Rule rule = RuleConvert.INSTANCE.tDataCenterRuleToRule(dataCenterRule);
        QueryWrapper<TDataCenterStorage> storageQueryWrapper = new QueryWrapper<>();
        storageQueryWrapper.eq("rule_id", rule.getId());
        rule.setStorage(StorageConvert.INSTANCE.tDataCenterStorageToStorage(storageService.getOne(storageQueryWrapper)));

        QueryWrapper<TDataCenterCalculate> calculateQueryWrapper = new QueryWrapper<>();
        calculateQueryWrapper.eq("rule_id", rule.getId());
        rule.setCalculates(CalculateConvert.INSTANCE.tDataCenterCalculatesToCalculates(calculateService.list(calculateQueryWrapper)));

        QueryWrapper<TDataCenterCollect> collectQueryWrapper = new QueryWrapper<>();
        collectQueryWrapper.eq("rule_id", rule.getId());
        rule.setCollects(CollectConvert.INSTANCE.tDataCenterCollectsToCollects(collectService.list(collectQueryWrapper)));

        QueryWrapper<TDataCenterMetadata> metadataQueryWrapper = new QueryWrapper<>();
        metadataQueryWrapper.eq("rule_id", rule.getId());
        rule.setMetadata(MetaDataConvert.INSTANCE.tDataCenterMetadataToMetadata(metaDataService.list(metadataQueryWrapper)));

        QueryWrapper<TDataCenterOrgan> orgamQueryWrapper = new QueryWrapper<>();
        orgamQueryWrapper.eq("rule_id", rule.getId());
        rule.setOrgans(OrganConvert.INSTANCE.tDataCenterOrgansToOrgans(organService.list(orgamQueryWrapper)));
        return rule;
    }
}
