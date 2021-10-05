package com.turntabl;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TradeTest {

    @Test
    public void checkPositivity(){
        Trade trade = new Trade("T1", "APPL", 100, 15.55);
        boolean isPositive;
        try {
            trade.setPrice(67);
            isPositive = true;
        } catch (Exception e) {
            isPositive = false;
        }
        assertTrue(isPositive);
    }
}
