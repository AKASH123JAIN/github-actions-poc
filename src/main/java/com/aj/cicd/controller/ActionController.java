package com.aj.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping("/action")
    public ResponseEntity<String> getMesssage(){
        return new ResponseEntity<>("Welcome to the Github Actions ", HttpStatus.OK);
    }

//    echo "# github-actions-poc" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/AKASH123JAIN/github-actions-poc.git
//    git push -u origin main
}
