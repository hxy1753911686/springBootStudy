package org.spring.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.spring.springboot.entity.User;

@Mapper //標誌為mybatis的mapper，不用xml方式
public interface UserDao {
    //select中標註要使用的sql語句,與xml中的sql語句一致
    @Select("select * from springbootdb.user where user_name = #{userName}")
    //對應xml中的resultMap
    @Results(value = {
            @Result(property = "id",column = "id"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "userDesc",column = "user_desc")
    })
    User findByName(@Param("userName") String userName);
}
