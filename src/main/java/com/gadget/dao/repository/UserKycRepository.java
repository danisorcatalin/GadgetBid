package com.gadget.dao.repository;

import com.gadget.dao.entity.UserKyc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserKycRepository extends JpaRepository<UserKyc, Long> {
}
