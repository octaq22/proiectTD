package com.example.ProiectTd.login;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class LoginRequest {
    private final String username;
    private final String password;
}
