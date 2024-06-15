package com.gadget.dao.repository;

import com.gadget.dao.entity.User;
import com.gadget.dao.entity.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailIgnoreCase(String email);

    @Query(" SELECT u FROM User u WHERE u.role = ?1")
    List<User> findByRole(Role role);

}
