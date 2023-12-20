// InputController.java
package com.techacademy1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class InputController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/input")
    public String getInput(Model model, @RequestParam(value = "previous", required = false) String previous) {
        model.addAttribute("pageTitle", messageSource.getMessage("page.title", null, Locale.getDefault()));
        model.addAttribute("inputPageTitle", messageSource.getMessage("input.page.title", null, Locale.getDefault()));
        model.addAttribute("inputPageDescription", messageSource.getMessage("input.page.description", null, Locale.getDefault()));
        model.addAttribute("previousValue", previous != null ? previous : null);

        return "input";
    }
}
