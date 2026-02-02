package com.example.apitest.repository;

import com.example.apitest.model.UserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<Long, UserProfile> users = new HashMap<>();

    public InMemoryUserRepository() {
        users.put(1L, new UserProfile(1L, "สมชาย ใจดี", 28, "somchai@example.com", "Bangkok, Thailand"));
        users.put(2L, new UserProfile(2L, "สมหญิง สายใจ", 31, "somying@example.com", "Chiang Mai, Thailand"));
        users.put(3L, new UserProfile(3L, "วีระ วัฒน์", 24, "weera@example.com", "Khon Kaen, Thailand"));
    }

    @Override
    public List<UserProfile> findAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Optional<UserProfile> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }
}
