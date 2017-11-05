package com.sam.spring5recipeapp.repository;

import com.sam.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {



}
