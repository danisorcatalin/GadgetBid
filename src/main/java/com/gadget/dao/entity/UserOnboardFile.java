package com.gadget.dao.entity;

import com.gadget.dao.entity.enums.UserOnboardFileStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_onboard_file")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOnboardFile {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "mimetype", length = 100, nullable = false)
    private String mimeType;

    @Column(name = "fileextension", nullable = false, length = 50)
    private String fileExtension;

    @Column(name = "filepath", nullable = false)
    private String filePath;

    @Column(name = "size")
    private Long size;

    @Column(name = "status", nullable = false)
    private UserOnboardFileStatus status;

    @Column(name = "createdat", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updatedat", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "onboardid")
    private UserOnboard userOnboard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

}
