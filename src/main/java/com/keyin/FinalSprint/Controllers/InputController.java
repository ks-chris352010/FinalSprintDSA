package com.keyin.FinalSprint.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {

    @GetMapping("/enter-numbers")
    public String showInputPage() {
        return "input";
    }
}
