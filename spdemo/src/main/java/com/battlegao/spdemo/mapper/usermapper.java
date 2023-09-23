
package com.battlegao.spdemo.mapper;

import com.battlegao.spdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface usermapper {

    @Select("SELECT * FROM demo")
    List<User> findall();
}
