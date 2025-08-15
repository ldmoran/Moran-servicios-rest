package com.espe.ubk.repository;

import org.springframework.data.repository.CrudRepository;

import com.espe.ubk.models.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {
}
