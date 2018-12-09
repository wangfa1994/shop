package com.wf.shop.user.mapper;

import com.wf.shop.user.bean.ShopUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ShopUser record);

    ShopUser selectByPrimaryKey(Long id);

    List<ShopUser> selectAll();

    int updateByPrimaryKey(ShopUser record);

    ShopUser queryByNameAndPwd(@Param("name") String name, @Param("password") String password);

}