package com.gadget.services;

import com.gadget.dao.entity.Audit;
import com.gadget.dao.repository.AuditRepository;
import com.gadget.dto.audit.AuditDto;
import com.gadget.services.common.MapperService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditService {

    private final AuditRepository auditRepository;
    private final MapperService mapperService;

    public AuditService(
            AuditRepository auditRepository,
            MapperService mapperService
    ) {
        this.auditRepository = auditRepository;
        this.mapperService = mapperService;
    }

    public void createAudit(Audit audit) {
        //TODO fix for files
//        auditRepository.save(audit);
    }

    public List<AuditDto> getAllAudits() {
        List<Audit> audits = auditRepository.findAllByOrderByIdDesc();
        // TODO check if user details are needed
        return mapperService.mapList(audits, AuditDto.class);
    }

}
