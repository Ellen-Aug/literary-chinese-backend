package com.ellen.literarychinese.service;

import com.ellen.literarychinese.dto.LoginRequest;
import com.ellen.literarychinese.dto.RegisterRequest;
import com.ellen.literarychinese.entity.LcStudent;
import com.ellen.literarychinese.repository.LcStudentRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final LcStudentRepository studentRepository;

    public AuthService(LcStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public boolean login(LoginRequest request) {
        LcStudent student = studentRepository.findByUsername(request.getUsername());
        if (student == null) return false;
        // Simple password check (in production use BCrypt)
        return student.getPasswordHash().equals(request.getPassword());
    }

    public boolean register(RegisterRequest request) {
        if (studentRepository.findByUsername(request.getUsername()) != null) {
            return false;
        }
        LcStudent student = new LcStudent();
        student.setUsername(request.getUsername());
        student.setPasswordHash(request.getPassword()); // TODO: hash in production
        student.setEmail(request.getEmail());
        student.setFullName(request.getFullName());
        studentRepository.save(student);
        return true;
    }
}
