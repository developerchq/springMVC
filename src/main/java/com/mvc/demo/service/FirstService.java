package com.mvc.demo.service;

import javax.annotation.Resource;

import com.mvc.demo.model.FirstModel;

/**
 * Created by AB052409 on 2016/12/6.
 */
@Resource
public interface FirstService  {
    public String getSomethingFromService(String str , FirstModel firstModel);
}
