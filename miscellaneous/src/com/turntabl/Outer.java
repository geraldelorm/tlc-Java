package com.turntabl;

public class Outer {
    private static int outerVar = 10;

    public static class Inner{
        private String something;

        public Inner(String something){
            this.something = something;
        }

        void display(){
            System.out.println( "Inner Static: " + outerVar);
        }
    }

    class InnerNonStatic{

        void display(){
            System.out.println("Inner NON static: "  + outerVar);
        }
    }

}
