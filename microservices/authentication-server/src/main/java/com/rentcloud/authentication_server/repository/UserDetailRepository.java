package com.rentcloud.authentication_server.repository;

import com.rentcloud.authentication_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String name);


}
