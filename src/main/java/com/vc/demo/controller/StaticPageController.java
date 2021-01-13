package com.vc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticPageController {
    @RequestMapping("/static")
    public String show(){
        return "static";
    }

    @RequestMapping("/static-with-model")
    public String withModel(Model model){
        model.addAttribute("name", "Vincent");
        return "static-with-model";
    }
}
