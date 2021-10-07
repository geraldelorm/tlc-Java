package com.turntabl;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestAccount {
    @Test
    public void testAccount(){
        Account acc = new Account(100);
        assertEquals(acc.getBalance(), 100);
    }

    @Test
    public void testAccountWithNegativeValues(){
        assertThrows(IllegalArgumentException.class, () -> new Account(-10));
    }

//    @Test
//    public void testAccoutWithNegValAgain(){
//        assertThatIllegalArgumentException().isThrownBy(() -> Account acc = new Account(-10))
//    }

}
