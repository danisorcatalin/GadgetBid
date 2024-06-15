package com.gadget.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_kyc_file")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserKycFile {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sessionid", nullable = false)
    private String sessionId;

    @Column(name = "mediaid", nullable = false)
    private String mediaId;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "filepath", nullable = false)
    private String filePath;

    @Column(name = "size")
    private Long size;

    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

}
