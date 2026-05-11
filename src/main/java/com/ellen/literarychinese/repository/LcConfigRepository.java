package com.ellen.literarychinese.repository;

import com.ellen.literarychinese.entity.LcConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LcConfigRepository extends JpaRepository<LcConfig, Long> {
    LcConfig findByConfigKey(String configKey);
}
