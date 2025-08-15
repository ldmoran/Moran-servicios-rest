package com.espe.ubk.servicios;

import java.util.List;
import java.util.Optional;
import com.espe.ubk.models.entity.User;

public interface UsersService {
    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    Optional<User> update(User user, Long id);
    void delete(Long id);
}
