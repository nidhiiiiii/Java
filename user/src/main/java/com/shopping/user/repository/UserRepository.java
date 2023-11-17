package com.shopping.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.shopping.user.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
}