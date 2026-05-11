package com.ellen.literarychinese.service;

import com.ellen.literarychinese.dto.ConfigResponse;
import com.ellen.literarychinese.entity.LcConfig;
import com.ellen.literarychinese.repository.LcConfigRepository;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    private final LcConfigRepository configRepository;

    public ConfigService(LcConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public ConfigResponse getLoginEnable() {
        LcConfig config = configRepository.findByConfigKey("login_enabled");
        boolean enabled = config != null && "true".equalsIgnoreCase(config.getConfigValue());
        return new ConfigResponse(enabled);
    }
}
