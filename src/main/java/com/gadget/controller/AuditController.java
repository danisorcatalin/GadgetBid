package com.gadget.controller;


import com.gadget.dto.audit.AuditDto;
import com.gadget.services.AuditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {

    private final AuditService auditService;

    public AuditController(AuditService auditService) {
        this.auditService = auditService;
    }

    //TODO deprecated?
    @GetMapping("/list")
    public List<AuditDto> auditControllerGetAuditList() {
        return auditService.getAllAudits();
    }

}
