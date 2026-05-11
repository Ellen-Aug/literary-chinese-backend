package com.ellen.literarychinese.repository;

import com.ellen.literarychinese.entity.LcStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LcStudentRepository extends JpaRepository<LcStudent, Long> {
    LcStudent findByUsername(String username);
}
