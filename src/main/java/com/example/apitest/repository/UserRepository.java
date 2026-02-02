package com.example.apitest.repository;

import com.example.apitest.model.UserProfile;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<UserProfile> findAll();
    Optional<UserProfile> findById(Long id);
}
