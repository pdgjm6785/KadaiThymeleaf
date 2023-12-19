package com.techacademy1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postOutput(Model model, @RequestParam("inputValue") String inputValue) {
        model.addAttribute("pageTitle", "Thymeleaf課題");
        model.addAttribute("outputPageTitle", "出力画面");
        model.addAttribute("outputValue", inputValue);

        return "output";
    }
}