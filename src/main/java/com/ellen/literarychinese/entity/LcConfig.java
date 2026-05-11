package com.ellen.literarychinese.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lc_config")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LcConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String configKey;
    private String configValue;
    private String description;
}
