package com.mvc.demo.service;

import com.mvc.demo.model.FirstModel;

import javax.annotation.Resource;

/**
 * Created by AB052409 on 2016/12/6.
 */
@Resource
public interface FirstService  {
    public String getSomethingFromService(String str , FirstModel firstModel);
}
