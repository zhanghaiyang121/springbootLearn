package com.example.db.mapper;

import com.example.db.bean.LitemallAd;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LitemallAdMapper {
   List<LitemallAd> getLitemallAdList();
}
