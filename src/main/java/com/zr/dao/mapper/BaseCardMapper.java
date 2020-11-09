package com.zr.dao.mapper;

import com.zr.dao.entity.BaseCard;

public interface BaseCardMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BaseCard record);

    int insertSelective(BaseCard record);

    BaseCard selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BaseCard record);

    int updateByPrimaryKeyWithBLOBs(BaseCard record);

    int updateByPrimaryKey(BaseCard record);
}