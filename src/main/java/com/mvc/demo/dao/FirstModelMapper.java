package com.mvc.demo.dao;

import com.mvc.demo.model.FirstModel;

/**
 * Created by AB052409 on 2016/12/7.
 */
public interface FirstModelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FirstModel record);

    int insertSelective(FirstModel record);

    FirstModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FirstModel record);

    int updateByPrimaryKey(FirstModel record);
}
