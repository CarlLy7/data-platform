package com.carl.infra.convert;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:13
 * @version: 1.0
 */

import com.carl.business.domain.Organ;
import com.carl.collect.CollectWayEnum;
import com.carl.infra.repository.entity.TDataCenterOrgan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:13
 * @version: 1.0
 */
@Mapper
public interface OrganConvert {
    OrganConvert INSTANCE= Mappers.getMapper(OrganConvert.class);

    Organ tDataCenterOrganToOrgan(TDataCenterOrgan tDataCenterOrgan);

    @Mapping(source = "collectWay",target = "collectWay",qualifiedByName = "collectWayEnumToValue")
    TDataCenterOrgan organToTDataCenterOrgan(Organ organ);

    @Named("collectWayEnumToValue")
    default Integer collectWayEnumToValue(CollectWayEnum collectWayEnum){
        return collectWayEnum.getValue();
    }
}
