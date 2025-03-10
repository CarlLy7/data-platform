package com.carl.business.service;

import com.carl.business.domain.Rule;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-10 21:40
 * @version: 1.0
 */
public interface RuleService {
    Rule getRule(String businessId, String ruleType);
}
