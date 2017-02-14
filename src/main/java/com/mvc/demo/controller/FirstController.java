package com.mvc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.demo.model.FirstModel;
import com.mvc.demo.service.FirstService;
import com.mvc.demo.service.FirstServiceImpl;

/**
 * Created by AB052409 on 2016/12/5.
 */
@Controller
public class FirstController {
    @Autowired
    private FirstService firstService;

    @RequestMapping("hello")
    @ResponseBody
    public String Hello(String str){
        FirstModel firstModel = new FirstModel();
        String reStr = firstService.getSomethingFromService(str,firstModel);
        return reStr;
    }
}
