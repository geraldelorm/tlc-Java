package com.optionals;

import java.math.BigDecimal;
import java.util.Optional;

public class Trade {
        private final String symbol;
        private final Optional<Integer> quantity;
        private final BigDecimal price;

        public Trade(String symbol, Optional<Integer> quantity, BigDecimal price) {
            this.symbol = symbol;
            this.quantity = quantity;
            this.price = price;
        }

        public String getSymbol() {
            return symbol;
        }

        public Optional<Integer> getQuantity() {
            return quantity;
        }

        public BigDecimal getPrice() {
            return price;
        }

    @Override
    public String toString() {
        return "Trade{" +
                "symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
