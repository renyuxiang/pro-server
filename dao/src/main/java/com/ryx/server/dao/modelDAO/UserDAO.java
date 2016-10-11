package com.ryx.server.dao.modelDAO;

import com.ryx.server.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    int insert(@Param("user") User user);
    int update(@Param("user") User user);
    int delete(@Param("user") User user);
    User query(@Param("phone") String phone);
}