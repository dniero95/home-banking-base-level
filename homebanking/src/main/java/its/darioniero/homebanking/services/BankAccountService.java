package its.darioniero.homebanking.services;

import its.darioniero.homebanking.repositories.BankAccountRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BankAccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;
}
