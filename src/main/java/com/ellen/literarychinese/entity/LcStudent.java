package com.ellen.literarychinese.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lc_students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LcStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String passwordHash;
    private String email;
    private String fullName;
}
