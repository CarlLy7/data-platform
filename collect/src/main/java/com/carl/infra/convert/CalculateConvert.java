package com.carl.infra.convert;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:02
 * @version: 1.0
 */

import com.carl.business.domain.Calculate;
import com.carl.collect.FunctionEnum;
import com.carl.infra.repository.entity.TDataCenterCalculate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:02
 * @version: 1.0
 */
@Mapper
public interface CalculateConvert {
    CalculateConvert INSTANCE= Mappers.getMapper(CalculateConvert.class);

    Calculate tDataCenterCalculateToCalculate(TDataCenterCalculate tDataCenterCalculate);

    List<Calculate> tDataCenterCalculatesToCalculates(List<TDataCenterCalculate> tDataCenterCalculates);

    @Mapping(source = "func",target = "func",qualifiedByName = "functionEnumTofuncName(com.carl.business.domain.Calculate.func)")
    TDataCenterCalculate calculateToTDataCenterCalculate(Calculate calculate);

    @Named("functionEnumTofuncName")
    default String functionEnumTofuncName(FunctionEnum functionEnum){
        return functionEnum.getFuncName();
    }
}
