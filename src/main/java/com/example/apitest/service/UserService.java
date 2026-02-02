package com.example.apitest.service;

import com.example.apitest.dto.UserProfileResponse;
import com.example.apitest.model.UserProfile;
import com.example.apitest.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserProfileResponse> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    public UserProfileResponse getUserById(Long id) {
        UserProfile user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        return toResponse(user);
    }

    private UserProfileResponse toResponse(UserProfile user) {
        return new UserProfileResponse(
                user.getId(),
                user.getFullName(),
                user.getAge(),
                user.getEmail(),
                user.getAddress()
        );
    }
}
