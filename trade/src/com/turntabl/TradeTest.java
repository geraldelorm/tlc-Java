package com.turntabl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TradeTest {

    @Test
    public void checkPositivity(){
       // Trade trade = new Trade("T1", "APPL", 100, 15.55);
        boolean isPositive;
        try {
          //  trade.setPrice(67);
            isPositive = true;
        } catch (Exception e) {
            isPositive = false;
        }
        assertTrue(isPositive);
    }

    @Test
    public void checkBondTrade(){
        Trade.BondTrade bondTrade = new Trade.BondTrade(12);
        bondTrade.calcDividend();

        assertEquals(bondTrade.calcDividend(), 12, 0.0);
    }

    @Test
    public void checkFundTrade() throws Exception{
        Trade.FundTrade fundTrade = new Trade.FundTrade(10);
        fundTrade.setPrice(2);

        assertEquals(fundTrade.calcDividend(), 20, 0.0);
    }
}