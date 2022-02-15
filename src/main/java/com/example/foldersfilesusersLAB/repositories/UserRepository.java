package com.example.foldersfilesusersLAB.repositories;

import com.example.foldersfilesusersLAB.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
