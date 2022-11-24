package com.fusiontech.lowcode.flowable.common.config;

import com.fusiontech.lowcode.flowable.model.resp.SampleDetailResp;
import org.flowable.ui.common.model.UserRepresentation;
import org.flowable.ui.common.rest.idm.CurrentUserProvider;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * @Author: mayike
 * @Date: 2022/11/21 14:58
 */
//@Component
public class SampleCurrentProvider implements CurrentUserProvider {
    @Override
    public UserRepresentation getCurrentUser(Authentication authentication) {
        if (null == authentication || null == authentication.getPrincipal()) {
            return new UserRepresentation();
        }
        SampleDetailResp currentUser = (SampleDetailResp) authentication.getPrincipal();
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setId(currentUser.getAccount());
        userRepresentation.setFullName(currentUser.getNickname());
        userRepresentation.setEmail(currentUser.getEmail());
        return userRepresentation;
    }

    @Override
    public boolean supports(Authentication authentication) {
        if (null == authentication) {
            return false;
        }
        return authentication.getPrincipal() instanceof SampleDetailResp;
    }
}
