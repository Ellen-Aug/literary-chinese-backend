package com.ellen.literarychinese.controller;

import com.ellen.literarychinese.dto.ConfigResponse;
import com.ellen.literarychinese.service.ConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/config")
public class ConfigController {

    private final ConfigService configService;

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("/login-enable")
    public ResponseEntity<ConfigResponse> getLoginEnable() {
        return ResponseEntity.ok(configService.getConfig("login.enable"));
    }

    /**
     * New endpoint for frontend
     */
    @GetMapping("/app.version")
    public ResponseEntity<ConfigResponse> getAppVersion() {
        return ResponseEntity.ok(configService.getConfig("app.version"));
    }
}
