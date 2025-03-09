package com.carl.infra;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 16:16
 * @version: 1.0
 */

import com.carl.CollectApplication;
import com.carl.infra.repository.entity.TDataCenterRule;
import com.carl.infra.repository.service.TDataCenterRuleService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 16:16
 * @version: 1.0
 */
@SpringBootTest(classes = CollectApplication.class)
public class RuleTest {
    private final Logger log= LoggerFactory.getLogger(RuleTest.class);
    @Autowired
    private TDataCenterRuleService tDataCenterRuleService;

    @Test
    public void testSave(){
        TDataCenterRule dataCenterRule = new TDataCenterRule();
        dataCenterRule.setBusinessId("1024");
        dataCenterRule.setBusinessName("1024");
        dataCenterRule.setEnName("1024");
        dataCenterRule.setRuleName("1024");
        dataCenterRule.setRuleType("1");
        dataCenterRule.setVersion("1");
        tDataCenterRuleService.save(dataCenterRule);
    }
    @Test
    public void testList(){
        List<TDataCenterRule> list = tDataCenterRuleService.list();
        for (TDataCenterRule tDataCenterRule : list) {
            System.out.println(tDataCenterRule);
        }
    }

}
