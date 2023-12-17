package com.techacademy1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class InputController {

        @GetMapping("/input")
        public String getinput() {
            // input.htmlに画面遷移
            return "input";
        }

        @PostMapping("/output")
        public String postOutput(@RequestParam("val") String val, Model model) {
            // フォームから送信されてきた値をModelに登録
            model.addAttribute("val", val);
            // confirm.htmlに画面遷移
            return "output";
        }
        @GetMapping("/link")
        public String getLink(Model model) {
            model.addAttribute("id", "123");
            return "link";
            }
    }