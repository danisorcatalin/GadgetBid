package com.gadget.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = true)
    private String phone;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "personalnumber", nullable = true)
    private String personalNumber;

    @Column(name = "walletid", nullable = true)
    private String walletId;

    @Column(name = "cardtype", nullable = true)
    private String cardType;

    @Column(name = "cardnumber", nullable = true)
    private String cardNumber;

    @Column(name = "cardvalidfrom", nullable = true)
    private String cardValidFrom;

    @Column(name = "cardvaliduntil", nullable = true)
    private String cardValidUntil;

    @Column(name = "country", nullable = true)
    private String country;

    @Column(name = "dateofbirth", nullable = true)
    private String dateOfBirth;

    @Column(name = "twofactorauthenticationsecret", nullable = true)
    private String twoFactorAuthenticationSecret;

    @Column(name = "twofactoractivated", nullable = false)
    private boolean twoFactorActivated;

    @Column(name = "verified", nullable = false)
    private boolean verified;

    @Column(name = "active", nullable = false)
    private boolean active;

    @Column(name = "kyccompleted", nullable = false)
    private boolean kycCompleted;

    @Column(name = "tourcomplete", nullable = false)
    private boolean tourComplete;

    @Column(name = "questionscompleted", nullable = false)
    private boolean questionsCompleted;

    @Column(name = "qascore", nullable = true)
    private Long qaScore;

    @Column(name = "properties", nullable = true)
    private String properties;

    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updatedat", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountmanagerid")
    private User accountManager;

    public boolean isAdmin() {
        return getRole().contains("ADMIN");
    }

}
