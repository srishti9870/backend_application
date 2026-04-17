package com.ecommerce.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import com.ecommerce.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

//public interface UserRepository extends CrudRepository<User, Long> {
//
//}