package springstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
/*
@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname, Model model) {
        //System.out.println("Hello " + name + " " + surname);
        model.addAttribute("message", "Hello " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodBye")
    public String goodByePage() {
        return "first/goodBye";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "a", required = false) int a,
                             @RequestParam(value = "b", required = false) int b,
                             @RequestParam(value = "operation", required = false) String operation, Model model) {
        double z;
        switch (operation) {
            case "multy":
                z = a * b;
                break;
            case "div":
                z = a / (double) b;
                break;
            case "add":
                z = a + b;
                break;
            case "sub":
                z = a - b;
                break;
            default:
                z = 0;

        }
        model.addAttribute("message", z);
        return "first/calculator";
    }
}*/