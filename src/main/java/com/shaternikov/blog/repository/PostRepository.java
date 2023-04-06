package com.shaternikov.blog.repository;

import com.shaternikov.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
