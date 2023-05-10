package rikkei.academy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {
    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @PostMapping(value = "condiment")
    public String condiment(@RequestParam (value = "condiment") String[] condiment, Model model) {
        model.addAttribute("condiment", condiment);
        return "result";
    }
}