package com.turntabl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TraderTest {

    @Test
    public void checkArithmetic(){
        Trader newTrader = new Trader();
       // Trade newTrade = new Trade("T1", "APPL", 100, 2);

      //  newTrader.addTrade(newTrade);
        assertEquals(newTrader.getAccount().getTotalValue(), 200, 0.0);

    }
}
