package com.example2.Schools;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends ReactiveMongoRepository<School,String> {
}
