package com.example.db.service;

import com.example.db.bean.LitemallAd;
import com.example.db.mapper.LitemallAdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LitemallAdService {
    @Autowired
    LitemallAdMapper litemallAdMapper;

    public List<LitemallAd> getLitemallAdList(){
        List<LitemallAd> list=litemallAdMapper.getLitemallAdList();
        return list;
    }

}
