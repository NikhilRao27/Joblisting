package com.JobApplication.Joblisting.repository;

import com.JobApplication.Joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post,String> {


}
