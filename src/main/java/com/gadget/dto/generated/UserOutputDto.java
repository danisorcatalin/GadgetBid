package com.gadget.dto.generated;

import com.gadget.dao.entity.enums.Role;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;


@Data
public class UserOutputDto {
    private BigDecimal id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String personalNumber;
    private String cardNumber;
    private String walletId;
    private String country;
    private String dateOfBirth;
    private BigDecimal active;
    private Role role;
    private VeriffDocumentType cardType;
    private UserOnboardOutputDto onboard;
    private UserOutputDto accountManager;
    private BigDecimal kycCompleted;
    private BigDecimal tourComplete;
    private BigDecimal questionsCompleted;
    private BigDecimal verified;
    private BigDecimal twoFactorActivated;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;
    private List<UserKycFileDto> kycFiles;
    private List<UserAnswerOutputDto> answers;
    private BigDecimal qaScore;

}

