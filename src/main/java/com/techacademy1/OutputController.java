package com.techacademy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class OutputController {

    @Autowired
    private MessageSource messageSource;

    @PostMapping("/output")
    public String postOutput(Model model, @RequestParam("inputValue") String inputValue) {
        model.addAttribute("pageTitle", messageSource.getMessage("page.title", null, Locale.getDefault()));
        model.addAttribute("outputPageTitle", messageSource.getMessage("output.page.title", null, Locale.getDefault()));
        model.addAttribute("outputValue", inputValue);

        return "output";
    }
}