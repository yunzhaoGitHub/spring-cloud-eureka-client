package com.yunzh.user.controller;


import com.yunzh.user.domain.User;
import com.yunzh.user.service.UserServiveImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * {@link User}用户服务的Rest API {@link RestController}
 */
@RestController
public class UserProviderRestApiController {

    private UserServiveImpl userServive;

    @Autowired
    public UserProviderRestApiController(UserServiveImpl userServive) {
        this.userServive = userServive;
    }

    /**
     * 保存用户
     * @param user User
     * @return 如果保存成功返回 {@link User},如果失败返回<code>null</code>
     */
    @PostMapping("/user/save")
    public User saveUser(@RequestBody User user){
        if (userServive.save(user)) {
            return user;
        } else {
            return null;
        }
    }

    /**
     * 查询所有用户
     * @return 所有用户的集合
     */
    @GetMapping("/user/list")
    public Collection<User> findAll() {
        return userServive.findAll();
    }

}
