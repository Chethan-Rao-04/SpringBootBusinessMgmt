package com.spring.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.business.entities.Admin;
import com.spring.business.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>
{
public User findUserByUemail(String email);
}
