package com.github.fedverdev.ezbank.repository;

import com.github.fedverdev.ezbank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
