package com.mvc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.demo.dao.FirstModelMapper;
import com.mvc.demo.model.FirstModel;
@Service("firstService")
public class FirstServiceImpl implements FirstService {

	@Autowired
	FirstModelMapper firstModelMapper;

	public String getSomethingFromService(String str, FirstModel firstModel) {
        FirstModel record = firstModelMapper.selectByPrimaryKey(1L);
        if(record!=null){
            return record.getUserName();
        }
		return str;
	}


}
