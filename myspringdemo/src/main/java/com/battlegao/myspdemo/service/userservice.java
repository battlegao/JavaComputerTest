
package com.battlegao.myspdemo.service;

import com.battlegao.myspdemo.entity.userEntity;
import com.battlegao.myspdemo.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {
    @Autowired
    private usermapper Usermapper;

    public List<userEntity> findall() {
        return Usermapper.findALL();
    }

    public Integer save(userEntity entity) {
        if (entity.getId() == null){
            //如果id为空，则为新增
            return Usermapper.save(entity);
        }else{
            //id不为空则是更新
            return Usermapper.update(entity);
        }
    }

    public Integer DELETE(Integer id){
        return Usermapper.DELETE(id);
    }
}
