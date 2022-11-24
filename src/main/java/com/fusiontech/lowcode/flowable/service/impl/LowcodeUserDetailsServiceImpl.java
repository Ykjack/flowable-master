package com.fusiontech.lowcode.flowable.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.fusiontech.lowcode.flowable.biz.repository.LowcodeUserRepository;
import com.fusiontech.lowcode.flowable.model.resp.LowcodeDetailResp;
import com.fusiontech.lowcode.flowable.biz.entity.User;
import liquibase.pro.packaged.U;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PACKAGE_NAME: com.fusiontech.lowcode.flowable.zw.service.impl
 * @NAME: LowcodeUserDetailsServiceImpl
 * @USER: jack
 * @DATE: 11/21/2022
 * @PROJECT_NAME: flowable-master
 **/
@Service
@RequiredArgsConstructor
public class LowcodeUserDetailsServiceImpl implements UserDetailsService {

    private final LowcodeUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LowcodeDetailResp lowcodeDetailResp = null;
        User user = new User();
        user.setName(username);
        //user.setIsEnabled(true);
        //User a = userRepository.findById("636902b9e5c4e22275a37b13").get();
        //saveUser();
        saveUser();
        List<User> all = userRepository.findAll();
        List<User> users = userRepository.findAll(Example.of(user));
        if(CollUtil.isNotEmpty(users)){
            lowcodeDetailResp = BeanUtil.toBean(users.get(0), LowcodeDetailResp.class);
        }
         return lowcodeDetailResp;
    }

    public void saveUser(){
        User user = new User();
        user.setName("admin");
        user.setPassword("123456");
        user.setEmail("1111");
        user.setIsEnabled(Boolean.TRUE);
        userRepository.save(user);
    }
}
