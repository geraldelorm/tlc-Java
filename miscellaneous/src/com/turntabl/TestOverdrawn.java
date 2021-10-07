package com.turntabl;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestOverdrawn {

    @Test
    public void overDrawnException() throws OverdrawnException{
        Account acc = new Account(100);

        assertThrows(OverdrawnException.class, () -> acc.withdraw(200));

    }
}
