package com.praktikum7.deploy.repository;


import com.praktikum7.deploy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {

}
