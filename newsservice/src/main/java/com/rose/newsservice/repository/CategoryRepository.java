package com.rose.newsservice.repository;

import com.rose.newsservice.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {           // entity클래스에 id에 해당하는 타입을 준다

}
