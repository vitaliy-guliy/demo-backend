package com.redhat.demo.webback.repos;

import com.redhat.demo.webback.models.MotionPicture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotionPictureRepo extends JpaRepository<MotionPicture, Integer> {
}
