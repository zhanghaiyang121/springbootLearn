package com.example.wx.controller;


import com.example.db.bean.LitemallAd;
import com.example.db.service.LitemallAdService;
import com.example.db.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class helloController {

    @Autowired
    LitemallAdService litemallAdService;

    @RequestMapping(value = "/")
    public String sayHello(){
        return "test";
    }

    @RequestMapping(value = "/getAdList")
    @ResponseBody
    public Object getAdList(){
        List<LitemallAd> list = litemallAdService.getLitemallAdList();

        return ResponseUtil.ok(list);
    }
}
