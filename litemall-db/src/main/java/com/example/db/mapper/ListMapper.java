package com.example.db.mapper;

import com.example.db.bean.ListBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListMapper {
    List<ListBean> getlist();
}
