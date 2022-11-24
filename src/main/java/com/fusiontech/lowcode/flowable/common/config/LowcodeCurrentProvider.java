package com.fusiontech.lowcode.flowable.common.config;

import com.fusiontech.lowcode.flowable.model.resp.LowcodeDetailResp;
import com.fusiontech.lowcode.flowable.model.resp.SampleDetailResp;
import com.fusiontech.lowcode.flowable.biz.entity.User;
import org.flowable.ui.common.model.UserRepresentation;
import org.flowable.ui.common.rest.idm.CurrentUserProvider;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: com.fusiontech.lowcode.flowable.common.config
 * @NAME: LowcodeCurrentProvider
 * @USER: jack
 * @DATE: 11/21/2022
 * @PROJECT_NAME: flowable-master
 **/
@Component
public class LowcodeCurrentProvider implements CurrentUserProvider {
    @Override
    public UserRepresentation getCurrentUser(Authentication authentication) {
        if (null == authentication || null == authentication.getPrincipal()) {
            return new UserRepresentation();
        }
        LowcodeDetailResp currentUser = (LowcodeDetailResp) authentication.getPrincipal();
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setId(currentUser.getEmail());
        userRepresentation.setFullName(currentUser.getName());
        userRepresentation.setEmail(currentUser.getEmail());
        return userRepresentation;
    }

    @Override
    public boolean supports(Authentication authentication) {
        if (null == authentication) {
            return false;
        }
        return authentication.getPrincipal() instanceof LowcodeDetailResp;
    }
}
