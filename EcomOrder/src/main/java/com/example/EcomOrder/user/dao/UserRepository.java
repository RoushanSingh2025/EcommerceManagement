package com.example.EcomOrder.user.dao;

import org.springframework.stereotype.Repository;

import com.example.EcomOrder.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
}
