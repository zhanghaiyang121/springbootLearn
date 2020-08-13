package com.example.wx.dao;



import com.example.db.bean.ListBean;
import com.example.db.bean.UserBean;

import java.util.List;

public class TestObj {
    private int a;
    private String b;
    private List<ListBean> data;
    public TestObj(int a, String b, List<ListBean> data){
        this.a=a;
        this.b=b;
        this.data=  data;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public List<ListBean> getData() {
        return data;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setData(List<ListBean> data) {
        this.data = data;
    }
}
