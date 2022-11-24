package com.fusiontech.lowcode.flowable.biz.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @PACKAGE_NAME: com.fusiontech.lowcode.flowable.zw.entity
 * @NAME: User
 * @USER: jack
 * @DATE: 11/21/2022
 * @PROJECT_NAME: flowable-master
 **/
@Data
@Document("User")
public class User {
    @Id
    String id;
    String name;
    String email;
    String password;
    Boolean isEnabled;
}
