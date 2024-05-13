package com.dependencyinjection;

public class MOTService {
    private EmailService emailService;

    // * Constructor Injection
    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
