package com.functional;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneValid("0554354909"));
        System.out.println(isPhoneValid("0046842627"));

        System.out.println(isPhonevalidPre.test("0554354909"));
        System.out.println(isPhonevalidPre.test("0046842627"));


        System.out.println(isPhonevalidPre.and(containsNum3).test("0546842627"));
        System.out.println(isPhonevalidPre.or(containsNum3).test("0546842627"));
        System.out.println(isPhonevalidPre.and(containsNum3).test("0543842627"));
    }

    static boolean isPhoneValid(String phoneNum) {

        return phoneNum.startsWith("05") && phoneNum.length() == 10;
    }

    static Predicate<String> isPhonevalidPre = phoneNum -> phoneNum.startsWith("05") && phoneNum.length() == 10;

    static Predicate<String> containsNum3 = num -> num.contains("3");
}
