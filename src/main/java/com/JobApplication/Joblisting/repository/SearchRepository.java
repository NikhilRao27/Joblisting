package com.JobApplication.Joblisting.repository;

import com.JobApplication.Joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
