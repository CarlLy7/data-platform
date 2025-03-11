package com.carl.infra.convert;

import com.carl.business.domain.Calculate;
import com.carl.collect.FunctionEnum;
import com.carl.infra.repository.entity.TDataCenterCalculate;
import jdk.jfr.Name;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:02
 * @version: 1.0
 */
@Mapper
public interface CalculateConvert {
    CalculateConvert INSTANCE= Mappers.getMapper(CalculateConvert.class);

    @Mapping(source = "func",target = "func",qualifiedByName = "parseFunctionEnumByFunc")
    @Mapping(source = "parameters",target = "parameters",qualifiedByName = "getparameterListByParameters")
    Calculate tDataCenterCalculateToCalculate(TDataCenterCalculate tDataCenterCalculate);

    List<Calculate> tDataCenterCalculatesToCalculates(List<TDataCenterCalculate> tDataCenterCalculates);

    @Mapping(source = "func",target = "func",qualifiedByName = "functionEnumTofuncName")
    @Mapping(source = "parameters",target = "parameters",qualifiedByName = "getparameterByParametersList")
    TDataCenterCalculate calculateToTDataCenterCalculate(Calculate calculate);

    @Named("functionEnumTofuncName")
    default String functionEnumTofuncName(FunctionEnum functionEnum){
        return functionEnum.getFuncName();
    }

    @Name("parseFunctionEnumByFunc")
    default FunctionEnum parseFunctionEnumByFunc(String func){
        return FunctionEnum.parse(func);
    }
    @Named("getparameterListByParameters")
    default List<String> getparameterListByParameters(String parameters){
        return Arrays.stream(parameters.split(",")).collect(Collectors.toList());
    }

    @Named("getparameterByParametersList")
    default String getparameterByParametersList(List<String> parameters){
        StringBuilder sb=new StringBuilder();
        for (String parameter : parameters) {
            sb.append(parameter);
            sb.append(",");
        }
        sb.delete(sb.length()-1,sb.length());
        return sb.toString();
    }
}
