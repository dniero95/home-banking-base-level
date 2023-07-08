package its.darioniero.homebanking.services;

import its.darioniero.homebanking.entities.BankAccount;
import its.darioniero.homebanking.repositories.BankAccountRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BankAccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;

    public BankAccount updateBankAccountBalance(Long bankAccountCode, BigDecimal deposit) {
        Optional<BankAccount> bankAccountToUpdate = bankAccountRepository.findById(bankAccountCode);
        if (bankAccountToUpdate.isPresent()) {
            BigDecimal newBalance = bankAccountToUpdate.get().getBalance().add(deposit);
            bankAccountToUpdate.get().setBalance(newBalance);
            return bankAccountRepository.save(bankAccountToUpdate.get());
        }
        return null;

    }

    public BankAccount fetchBankAccountByCode(String code) {
        Optional<BankAccount> bankAccount = bankAccountRepository.findById(Long.parseLong(code));
        if (bankAccount.isPresent()) {
            return bankAccount.get();
        }
        return null;
    }
}
