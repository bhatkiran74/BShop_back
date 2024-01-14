package com.example.BShop_back.repository.impl;

import com.example.BShop_back.Entity.QUser;
import com.example.BShop_back.repository.BaseRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public abstract class BaseRepositoryImpl<T,ID> extends SimpleJpaRepository<T,ID> implements BaseRepository<T,ID> {



    EntityManager em;
    JPAQueryFactory jpaQueryFactory;


    protected final QUser user= QUser.user;

    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);

        this.em = em;
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

    @Override
    public T findByIdMandatory(ID id) throws IllegalArgumentException {
        return findById(id).orElseThrow(()-> new IllegalArgumentException("entity not found"+id));
    }
}
