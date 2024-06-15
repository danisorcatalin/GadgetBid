package com.gadget.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_question")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQuestion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "variant1", nullable = false)
    private String variant1;

    @Column(name = "variant2", nullable = false)
    private String variant2;

    @Column(name = "variant3", nullable = false)
    private String variant3;

    @Column(name = "correctvariant", nullable = false)
    private Integer correctVariant;

    @Column(name = "order", nullable = false)
    private Integer order;

    @Column(name = "active", nullable = false)
    private boolean active;

}
