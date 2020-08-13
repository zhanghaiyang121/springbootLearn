package com.example.wx.controller;


import com.example.db.bean.ListBean;
import com.example.db.service.ListService;
import com.example.wx.dao.TestObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class helloController {
    @Autowired
    ListService userService;

    @RequestMapping(value = "/")
    public String sayHello(){
        return "test";
    }

    @RequestMapping(value = "/getall")
    @ResponseBody
    public TestObj getall(){
        List<ListBean> list = userService.getlist();
        TestObj data=new TestObj(200,"获取数据成功",list);
        return data;
    }



}
