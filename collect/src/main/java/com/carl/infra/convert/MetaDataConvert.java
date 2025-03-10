package com.carl.infra.convert;

import com.carl.business.domain.Metadata;
import com.carl.collect.DataTypeEnum;
import com.carl.collect.SourceTypeEnum;
import com.carl.infra.repository.entity.TDataCenterMetadata;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-10 21:56
 * @version: 1.0
 */
@Mapper
public interface MetaDataConvert {
    MetaDataConvert INSTANCE= Mappers.getMapper(MetaDataConvert.class);

    @Mapping(source = "dataType",target = "dataType",qualifiedByName = "getDateType(com.carl.business.domain.Metadata.dataType)")
    @Mapping(source = "sourceType",target = "sourceType",qualifiedByName = "getSourceType(com.carl.business.domain.Metadata.sourceType)")
    TDataCenterMetadata metaDataToTDataCenterMetadata(Metadata metadata);

    @Mapping(source = "dataType",target = "dataType",qualifiedByName = "parseDataTypeEnumByJavaStrType")
    @Mapping(source = "sourceType",target = "sourceType",qualifiedByName = "parseSourceTypeEnumBySourceType")
    Metadata tDataCenterMetadataToMetadata(TDataCenterMetadata tDataCenterMetadata);

    @Mapping(source = "dataType",target = "dataType",qualifiedByName = "parseDataTypeEnumByJavaStrType")
    @Mapping(source = "sourceType",target = "sourceType",qualifiedByName = "parseSourceTypeEnumBySourceType")
    List<Metadata> tDataCenterMetadataToMetadata(List<TDataCenterMetadata> tDataCenterMetadatas);

    @Named("getDateType")
    default String getDateType(DataTypeEnum dataTypeEnum){
        return dataTypeEnum.getJavaStrType();
    }

    @Named("getSourceType")
    default Integer getSourceType(SourceTypeEnum sourceTypeEnum){
        return sourceTypeEnum.getValue();
    }

    @Named("parseDataTypeEnumByJavaStrType")
    default DataTypeEnum parseDataTypeEnumByJavaStrType(String dataType){
        return DataTypeEnum.parseByJavaStrType(dataType);
    }

    @Named("parseSourceTypeEnumBySourceType")
    default SourceTypeEnum parseSourceTypeEnumBySourceType(Integer sourceType){
        return SourceTypeEnum.parse(sourceType);
    }
}
