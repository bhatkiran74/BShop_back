package com.example.BShop_back.repository.impl;

import com.example.BShop_back.Entity.User;
import com.example.BShop_back.repository.UserRepository;
import jakarta.persistence.EntityManager;

public class UserRepositoryImpl extends BaseRepositoryImpl<User, Integer> implements UserRepository {

    public UserRepositoryImpl(EntityManager em) {
        super(User.class, em);
    }







}
