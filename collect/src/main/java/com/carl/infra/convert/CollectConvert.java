package com.carl.infra.convert;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 20:48
 * @version: 1.0
 */

import com.carl.business.domain.Collect;
import com.carl.collect.CollectWayEnum;
import com.carl.infra.repository.entity.TDataCenterCollect;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 20:48
 * @version: 1.0
 */
@Mapper
public interface CollectConvert {
    CollectConvert INSTANCE= Mappers.getMapper(CollectConvert.class);

    Collect tDataCenterCollectToCollect(TDataCenterCollect tDataCenterCollect);

    @Mapping(source = "collectWay",target = "collectWay",qualifiedByName = "collectWayEnumToValue")
    TDataCenterCollect collectToCollect(Collect collect);

    @Named("collectWayEnumToValue")
    default Integer collectWayEnumToValue(CollectWayEnum collectWayEnum){
        return collectWayEnum.getValue();
    }
}
