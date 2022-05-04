package com.valentinpopescu98.webapp.registration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RegistrationRequest {
    private final String username;
    private final String password;
}
