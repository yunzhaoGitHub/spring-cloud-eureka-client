package com.yunzh.user.service;

import com.yunzh.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * {@link IUserService} Proxy 实现
 */
@Service
public class UserServiceProxy implements IUserService {

    private static final String PROVIDER_SERVER_URL_PREFIX = "http://user-service-provider";

    private RestTemplate restTemplate;

    @Autowired
    public UserServiceProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public boolean save(User user) {
        User user1 =
                restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX + "/user/save", user, User.class);
        return user1 != null;
    }

    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(PROVIDER_SERVER_URL_PREFIX + "/user/list", Collection.class);
    }
}
