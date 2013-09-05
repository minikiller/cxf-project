package com.sunlf.tp.restfule.impl;

import com.sunlf.tp.restfule.MyService;
import com.sunlf.tp.restfule.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * <b>
 * Title:</b> 主题
 * <br><b>
 * Description:</b> 类功能描述
 * <br><b>
 * Copyright:</b>  Copyright (c) 2013
 * <br><b>
 * Company:</b> 长春丽明科技开发有限公司
 * User: dell
 * Date: 13-7-21
 * Time: 下午12:21
 *
 * @version 1.0
 */

public class MyServiceImpl implements MyService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }

    @Override
    public User getUser(String id) {
        User user = new User();
        user.setName("cxs" + id);
        user.setPswd("123" + id);
        return user;
    }
}
