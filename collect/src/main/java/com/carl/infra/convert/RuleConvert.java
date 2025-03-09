package com.carl.infra.convert;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:02
 * @version: 1.0
 */

import com.carl.business.domain.Rule;
import com.carl.collect.RuleTypeEnum;
import com.carl.infra.repository.entity.TDataCenterRule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:02
 * @version: 1.0
 */
@Mapper
public interface RuleConvert {
    RuleConvert INSTANCE = Mappers.getMapper(RuleConvert.class);

    Rule tDataCenterRuleToRule(TDataCenterRule tDataCenterRule);

    @Mapping(source = "ruleType", target = "ruleType", qualifiedByName = "ruleTypeEnumToRuleType")
    TDataCenterRule ruleToTDataCenterRule(Rule rule);

    @Named("ruleTypeEnumToRuleType")
    default Integer ruleTypeEnumToRuleType(RuleTypeEnum ruleTypeEnum) {
        return ruleTypeEnum.getValue();
    }
}
