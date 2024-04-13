package pl.edu.wszib.http2.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(Model model) {
        model.addAttribute("imie", "Ala");
        model.addAttribute("pokaz", false);
        model.addAttribute("kolory", Arrays.asList("red", "yellow", "green"));
        model.addAttribute("teraz", new Date());
        return "test";
    }

}
