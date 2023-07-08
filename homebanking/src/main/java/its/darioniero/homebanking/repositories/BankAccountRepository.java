package its.darioniero.homebanking.repositories;

import its.darioniero.homebanking.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
}
