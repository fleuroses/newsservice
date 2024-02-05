package com.rose.newsservice.repository;

import com.rose.newsservice.entity.SourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<SourceEntity, Long> {
}
