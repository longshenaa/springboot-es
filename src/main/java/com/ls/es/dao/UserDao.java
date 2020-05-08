package com.ls.es.dao;

import com.ls.es.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserEntity, String> {
}
