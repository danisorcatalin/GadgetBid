package com.gadget.dao.repository;

import com.gadget.dao.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuditRepository extends JpaRepository<Audit, Long> {

    List<Audit> findAllByOrderByIdDesc();

}
