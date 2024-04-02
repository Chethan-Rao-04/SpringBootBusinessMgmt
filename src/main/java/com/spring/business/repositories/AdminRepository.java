package com.spring.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.business.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer>
{
	public Admin findByAdminEmail(String email);
}
