package com.example.demo.boot.sql.repository;

import com.example.demo.boot.sql.entity.MyUser;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MyUserRepository extends CrudRepository<MyUser, Integer> {

}
