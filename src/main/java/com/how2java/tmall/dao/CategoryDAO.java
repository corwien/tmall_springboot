package com.how2java.tmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.how2java.tmall.pojo.Category;

 
/**
 * [说明]
 *
 * CategoryDAO 类集成了 JpaRepository，就提供了CRUD和分页 的各种常见功能。 这就是采用 JPA 方便的地方~
 */

public interface CategoryDAO extends JpaRepository<Category, Integer>{

}