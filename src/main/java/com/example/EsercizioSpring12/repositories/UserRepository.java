package com.example.EsercizioSpring12.repositories;

import com.example.EsercizioSpring12.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
