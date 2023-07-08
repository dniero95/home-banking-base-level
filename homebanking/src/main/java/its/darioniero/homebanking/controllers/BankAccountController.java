package its.darioniero.homebanking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

    @GetMapping
    public String getIndexView(){
        return "index";
    }

    @GetMapping("/deposit")
    public String getDepositView(){
        return "deposit";
    }

    @GetMapping("/confirm")
    public String getConfirmView(){
        return "confirm";
    }
}
