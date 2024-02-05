package com.rose.newsservice.repository;

import com.rose.newsservice.entity.CategoryEntity;
import com.rose.newsservice.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Long>{
}
