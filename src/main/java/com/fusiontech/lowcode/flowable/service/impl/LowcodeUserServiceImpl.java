package com.fusiontech.lowcode.flowable.service.impl;

import com.fusiontech.lowcode.flowable.biz.entity.User;
import com.fusiontech.lowcode.flowable.biz.repository.LowcodeUserRepository;
import com.fusiontech.lowcode.flowable.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: com.fusiontech.lowcode.flowable.service.impl
 * @NAME: LowcodeUserServiceImpl
 * @USER: jack
 * @DATE: 11/21/2022
 * @PROJECT_NAME: flowable-master
 **/
@Service
@RequiredArgsConstructor
public class LowcodeUserServiceImpl implements IUserService {
    private final LowcodeUserRepository lowcodeUserRepository;
    @Override
    public User findById(String id) {
        return lowcodeUserRepository.findById(id).get();
    }
}
