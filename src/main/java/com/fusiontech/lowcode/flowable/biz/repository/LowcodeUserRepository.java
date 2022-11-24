package com.fusiontech.lowcode.flowable.biz.repository;

import com.fusiontech.lowcode.flowable.biz.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LowcodeUserRepository extends MongoRepository<User,String> {

}
