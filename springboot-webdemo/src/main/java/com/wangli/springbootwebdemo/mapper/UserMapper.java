package com.wangli.springbootwebdemo.mapper;

import com.wangli.springbootwebdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author wangli
 */
@Repository
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findUserById(@Param("id") Integer id);

    @Insert("insert into user(age,name) values(#{age},#{name})")
    boolean insertUser(@Param("age") Integer age, @Param("name") String name);
}
