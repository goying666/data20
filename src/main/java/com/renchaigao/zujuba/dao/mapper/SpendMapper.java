package com.renchaigao.zujuba.dao.mapper;

import com.renchaigao.zujuba.dao.Spend;

public interface SpendMapper {
    int deleteByPrimaryKey(String id);

    int insert(Spend record);

    int insertSelective(Spend record);

    Spend selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Spend record);

    int updateByPrimaryKey(Spend record);
}