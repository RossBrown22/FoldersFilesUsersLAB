package com.example.foldersfilesusersLAB.components;

import com.example.foldersfilesusersLAB.models.File;
import com.example.foldersfilesusersLAB.models.Folder;
import com.example.foldersfilesusersLAB.models.User;
import com.example.foldersfilesusersLAB.repositories.FileRepository;
import com.example.foldersfilesusersLAB.repositories.FolderRepository;
import com.example.foldersfilesusersLAB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args) {

        User ross = new User("Ross");
        userRepository.save(ross);

        User alex = new User("Alex");
        userRepository.save(alex);

        Folder mods = new Folder("Mods", ross);
        folderRepository.save(mods);

        Folder movies = new Folder("Movies", alex);
        folderRepository.save(movies);

        File lotr = new File("LOTR", "mp4", 200, movies);
        fileRepository.save(lotr);

        File funny = new File("Funny Mod", "java", 10, mods);
        fileRepository.save(funny);
    }
}
