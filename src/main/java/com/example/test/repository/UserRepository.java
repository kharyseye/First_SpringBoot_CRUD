package com.example.test.repository;

import com.example.test.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    //declarons une methode custom
    public Long countById(Long id);
}
