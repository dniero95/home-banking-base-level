package its.darioniero.homebanking.controllers;

import its.darioniero.homebanking.entities.BankAccount;
import its.darioniero.homebanking.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    @GetMapping
    public String getIndexView(){
        return "index";
    }

    @GetMapping("/deposit")
    public String getDepositView(Model model, @RequestParam("bankAccountCode") String code){


        BankAccount bankAccount = bankAccountService.fetchBankAccountByCode(code);

        if (bankAccount == null){
            return "error";
        }

        model.addAttribute(bankAccount);

        return "deposit";
    }

    @GetMapping("/confirm")
    public String getConfirmView(){
        return "confirm";
    }

    @GetMapping("/error")
    public String getErrorView(){
        return "error";
    }
}
