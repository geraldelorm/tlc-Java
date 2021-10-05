package com.turntabl;

public class MembershipType {

    public static class Bronze extends MembershipType{
        private final int limit = 5;

        public int getLimit() {
            return limit;
        }
    }

    public static class Silver extends MembershipType{
        private final int limit = 10;

        public int getLimit() {
            return limit;
        }
    }

    public static class Gold extends MembershipType{
        private final int limit = 20;

        public int getLimit() {
            return limit;
        }
    }

}
