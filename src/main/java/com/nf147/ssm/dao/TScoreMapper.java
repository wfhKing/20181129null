package com.nf147.ssm.dao;

import com.nf147.ssm.entity.TScore;

import java.util.List;

public interface TScoreMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(TScore record);

    TScore selectByPrimaryKey(Integer id);

    List<TScore> selectAll();

    int updateByPrimaryKey(TScore record);
}