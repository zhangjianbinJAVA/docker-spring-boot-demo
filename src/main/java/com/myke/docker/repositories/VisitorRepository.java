package com.myke.docker.repositories;

import com.myke.docker.domains.Visitor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 基于 Spring Data JPA 实现数据访问，该处无需对 VisitorRepositor 接口进行实现
 */
public interface VisitorRepository extends MongoRepository<Visitor, String> {
}