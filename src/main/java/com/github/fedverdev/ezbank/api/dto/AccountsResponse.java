package com.github.fedverdev.ezbank.api.dto;

import java.util.List;

public record AccountsResponse(List<Long> accountIds) {
}