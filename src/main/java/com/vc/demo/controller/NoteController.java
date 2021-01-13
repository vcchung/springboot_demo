package com.vc.demo.controller;

import com.vc.demo.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteController {

    @GetMapping
    public @ResponseBody Note getLastNote(){
        return new Note("this is a sample note", "Vincent");
    }
}
