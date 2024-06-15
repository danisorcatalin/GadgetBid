package com.gadget.dao.repository;

import com.gadget.dao.entity.UserOnboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOnboardRepository extends JpaRepository<UserOnboard, Long> {

    UserOnboard findByUserId(Long userId);

}
