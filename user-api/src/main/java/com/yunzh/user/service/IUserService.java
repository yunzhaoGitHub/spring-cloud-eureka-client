package com.yunzh.user.service;

import com.yunzh.user.domain.User;

import java.util.Collection;

/**
 * 用户服务
 */
public interface IUserService {

    /**
     * 保存用户
     * @return 保存成功返回<code>true<code/>  失败返回<code>false<code/>
     */
    boolean save(User user);


    /**
     * 查询所有用户
     * @return
     */
    Collection<User> findAll();
}
