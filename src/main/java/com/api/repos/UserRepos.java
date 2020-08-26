package com.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.UserEntities;

@Repository
public interface UserRepos extends CrudRepository<UserEntities, Integer> {

}
