package com.example.db.service.imp;

import com.example.db.bean.ListBean;
import com.example.db.mapper.ListMapper;
import com.example.db.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceImpl implements ListService {

    @Autowired
    ListMapper listMapper;

    @Override
    public List<ListBean> getlist() {
        return listMapper.getlist();
    }
}
