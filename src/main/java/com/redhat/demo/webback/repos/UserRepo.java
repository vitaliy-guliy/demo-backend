package com.redhat.demo.webback.repos;

import com.redhat.demo.webback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
