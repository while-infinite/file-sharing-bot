package ru.karen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.karen.entity.AppUser;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByTelegramUserId(Long id);
    Optional<AppUser> findByEmail(String email);;
}
