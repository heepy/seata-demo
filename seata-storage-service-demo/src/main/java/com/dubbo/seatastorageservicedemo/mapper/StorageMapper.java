package com.dubbo.seatastorageservicedemo.mapper;

import com.dubbo.seatastorageservicedemo.entity.CommodityPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper {
    int decreaseStorage(@Param("commodityPo") CommodityPo commodityPo);
    int selectStorageByCommodityCode(@Param("commodityCode")String commodityCode);
    void addCommodityCode(@Param("commodityPo")CommodityPo commodityPo);
}
