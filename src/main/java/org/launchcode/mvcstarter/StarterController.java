package org.launchcode.mvcstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
@Controller
public class StarterController {
    @GetMapping("form")
    public String helloForm() {
        return "form";
    }
    @GetMapping("hello")
    public String hello(@RequestParam String coder, @RequestParam String language, Model model){
        if (language.equals("spanish")){
            String greeting = "Hola" + coder;
            model.addAttribute("greeting", greeting);
        }else {
            String greeting =  "hello" + coder;
            model.addAttribute("greeting", greeting);
        }
        return "hello";
    }
}
