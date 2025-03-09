package com.carl.infra.convert;/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:02
 * @version: 1.0
 */

import com.carl.business.domain.Storage;
import com.carl.infra.repository.entity.TDataCenterStorage;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @description:
 * @author: carl
 * @createDate: 2025-03-09 21:02
 * @version: 1.0
 */
@Mapper
public interface StorageConvert {
    StorageConvert INSTANCE= Mappers.getMapper(StorageConvert.class);

    Storage tDataCenterStorageToStorage(TDataCenterStorage tDataCenterStorage);

    TDataCenterStorage storageToTDataCenterStorage(Storage storage);
}
