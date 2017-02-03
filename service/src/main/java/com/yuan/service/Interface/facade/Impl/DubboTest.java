package com.yuan.service.Interface.facade.Impl;

import com.yuan.facade.IDubboTest;

/**
 * Created by yuan on 17/1/31.
 */
public class DubboTest implements IDubboTest{

    @Override
    public String hello(String name) {
        return "hello, "+name;
    }
}
