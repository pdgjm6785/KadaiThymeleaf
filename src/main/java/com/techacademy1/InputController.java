// InputController.java
package com.techacademy1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(Model model, @RequestParam(value = "previous", required = false) String previous) {
        model.addAttribute("pageTitle", "Thymeleaf課題");
        model.addAttribute("inputPageTitle", "入力画面");
        model.addAttribute("inputPageDescription", "値を入力してください。");
        model.addAttribute("previousValue", previous);

        return "input";
    }
}