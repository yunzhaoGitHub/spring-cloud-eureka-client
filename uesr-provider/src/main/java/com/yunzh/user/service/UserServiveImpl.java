package com.yunzh.user.service;

import com.yunzh.user.domain.User;
import com.yunzh.user.repository.UserRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * 用户服务
 */
@Service
public class UserServiveImpl implements IUserService {


    private UserRepostiory userRepostiory;

    @Autowired
    public UserServiveImpl(UserRepostiory userRepostiory) {
        this.userRepostiory = userRepostiory;
    }

    /**
     * 保存方法
     * @param user
     * @return 如果成功返回<code>true</code> 否则返回 <code>false</code>
     */
    public boolean save(User user) {
        return userRepostiory.save(user);
    }

    /**
     * 查询所有
     * @return
     */
    public Collection<User> findAll() {
        return userRepostiory.findAll();
    }
}
