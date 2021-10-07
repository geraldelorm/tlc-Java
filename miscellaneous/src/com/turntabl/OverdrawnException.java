package com.turntabl;

public class OverdrawnException extends Exception{

    public OverdrawnException (String message) {
        super(message);
    }
}
