package com.everis.delivery.repository;

import com.everis.delivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findNByname(String name); //Somente para teste.
}
