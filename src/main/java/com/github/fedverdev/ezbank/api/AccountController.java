package com.github.fedverdev.ezbank.api;

import com.github.fedverdev.ezbank.api.dto.AccountsResponse;
import com.github.fedverdev.ezbank.api.dto.TransactionRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    // POST /api/v1/account/create
    @PostMapping("/account/create")
    public void create() {
        // TODO: логика создания аккаунта
    }

    @GetMapping("/account/")
    public AccountsResponse getAllAccounts() {
        // TODO: логика получения всех аккаунтов
        throw new RuntimeException();
    }

    @PostMapping("/transaction/")
    public void transaction(@RequestBody TransactionRequest request) {
        // TODO: логика транзакции
        throw new RuntimeException();
    }
}