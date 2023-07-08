package its.darioniero.homebanking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

    @GetMapping
    public String getIndex(){
        return "index";
    }
}
