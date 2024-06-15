package com.gadget.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_kyc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserKyc {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user", nullable = false)
    private Long userNum;

    @Column(name = "sessionid", nullable = false)
    private String sessionId;

    @Column(name = "status")
    private String status;

    @Column(name = "response", nullable = false)
    private String response;

    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

}
