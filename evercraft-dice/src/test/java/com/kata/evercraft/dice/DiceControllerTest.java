package com.kata.evercraft.dice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiceControllerTest {

    DiceController diceController;

    @BeforeEach
    public void setUp() {
        diceController = new DiceController();
    }
    @Test
    public void shouldReturnRandomNumberUnder20() {
        assertThat(diceController.roll()).isLessThan(20);
    }
}