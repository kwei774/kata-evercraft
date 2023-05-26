package com.kata.evercraft.dice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
public class DiceController {
    SecureRandom secureRandom;

    public DiceController() {
        secureRandom = new SecureRandom();
    }
    @GetMapping("/roll")
    public Integer roll() {
        return secureRandom.nextInt(20);
    }
}
