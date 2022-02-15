package com.example.foldersfilesusersLAB.repositories;

import com.example.foldersfilesusersLAB.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
