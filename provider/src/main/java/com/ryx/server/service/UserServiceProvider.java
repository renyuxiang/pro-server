package com.ryx.server.service;

import com.alibaba.fastjson.JSON;
import com.ryx.server.Msg.Result;
import com.ryx.server.Msg.ResultCode;
import com.ryx.server.bean.User;
import com.ryx.server.dao.modelDAO.UserDAO;
import com.ryx.server.util.UUIDGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * 服务提供者
 * Created by lenovo on 2016/10/11.
 */
public class UserServiceProvider implements UserService{
    public static Logger logger = LoggerFactory.getLogger(UserServiceProvider.class);

    @Resource
    private UserDAO userDAO;

    @Override
    public String insert(User user) {
        Result result = new Result(ResultCode.FAIL,null);
        user.setId(UUIDGenerator.getUUID(UUIDGenerator.LOWER));
        int i = userDAO.insert(user);
        if (i>=1){
            result.setCode(ResultCode.OK);
        }
        return JSON.toJSONString(result);
    }

    @Override
    public String query(String s) {
        Result result = new Result(ResultCode.FAIL,null);
        User user = userDAO.query(s);
        if (user!=null){
            result.setCode(ResultCode.OK);
            result.setObj(user);
        }
        return JSON.toJSONString(result);
    }

    @Override
    public String delete(String s) {
        Result result = new Result(ResultCode.FAIL,null);
        User temp = new User();
        temp.setId(s);
        int i = userDAO.delete(temp);
        if (i>=1){
            result.setCode(ResultCode.OK);
        }
        return JSON.toJSONString(result);
    }
}
