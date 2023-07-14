package its.darioniero.homebanking.controllers;

import its.darioniero.homebanking.entities.BankAccount;
import its.darioniero.homebanking.services.BankAccountService;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Controller
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    @GetMapping
    public String getIndexView() {
        return "index";
    }

    @GetMapping("/deposit")
    public String getDepositView(Model model, @RequestParam("bankAccountCode") String code) {


        BankAccount bankAccount = bankAccountService.fetchBankAccountByCode(code);

        if (bankAccount == null) {
            return "error";
        }

        model.addAttribute(bankAccount);

        return "deposit";
    }

    @GetMapping("/confirm")
    public String getConfirmView(Model model, @RequestParam("code") String code, @RequestParam("amount") String amount) {
        BankAccount updatedBankAccount = bankAccountService.updateBankAccountBalance(Long.parseLong(code), new BigDecimal(amount));
        model.addAttribute("account", updatedBankAccount);
        return "confirm";
    }

    @GetMapping("/error")
    public String getErrorView() {
        return "error";
    }
}
