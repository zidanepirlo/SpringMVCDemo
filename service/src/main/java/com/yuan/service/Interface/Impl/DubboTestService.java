package com.yuan.service.Interface.Impl;

import com.yuan.service.Interface.IDubboTestService;

/**
 * Created by yuan on 17/1/31.
 */
public class DubboTestService implements IDubboTestService {
    @Override
    public String testdubbo() {
        return "hello,this is a testdubbo!";
    }
}
