package com.kata.evercraft.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class DiceControllerTest {
    @Test
    public void shouldReturnNumber() {
        DiceController diceController = new DiceController();
        assertThat(diceController.roll()).isEqualTo(0);
    }
}