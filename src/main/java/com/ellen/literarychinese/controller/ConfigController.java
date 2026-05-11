package com.ellen.literarychinese.controller;

import com.ellen.literarychinese.dto.ConfigResponse;
import com.ellen.literarychinese.dto.LoginRequest;
import com.ellen.literarychinese.dto.RegisterRequest;
import com.ellen.literarychinese.service.AuthService;
import com.ellen.literarychinese.service.ConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ConfigController {

    private final ConfigService configService;
    private final AuthService authService;

    public ConfigController(ConfigService configService, AuthService authService) {
        this.configService = configService;
        this.authService = authService;
    }

    @GetMapping("/config/login-enable")
    public ResponseEntity<ConfigResponse> getLoginEnable() {
        return ResponseEntity.ok(configService.getLoginEnable());
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody LoginRequest request) {
        boolean success = authService.login(request);
        return ResponseEntity.ok(success);
    }

    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody RegisterRequest request) {
        boolean success = authService.register(request);
        return ResponseEntity.ok(success);
    }
}
