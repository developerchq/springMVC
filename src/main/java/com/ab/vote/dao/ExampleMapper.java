package com.ab.vote.dao;

import com.ab.vote.Example;
import com.ab.vote.ExampleCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExampleMapper {
    int countByCondition(ExampleCondition example);

    int deleteByCondition(ExampleCondition example);

    int deleteById(Integer id);

    int insert(Example record);

    int insertSelective(Example record);

    List<Example> selectByCondition(ExampleCondition example);

    Example selectById(Integer id);

    int updateByConditionSelective(@Param("record") Example record, @Param("example") ExampleCondition example);

    int updateByCondition(@Param("record") Example record, @Param("example") ExampleCondition example);

    int updateByIdSelective(Example record);

    int updateById(Example record);
}