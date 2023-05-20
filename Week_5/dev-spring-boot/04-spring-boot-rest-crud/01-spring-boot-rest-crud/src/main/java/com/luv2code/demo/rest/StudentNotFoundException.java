package com.luv2code.demo.rest;

public class StudentNotFoundException  extends RuntimeException{
    
    private static String cause;

    public StudentNotFoundException(String message){
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public StudentNotFoundException(Throwable message){
        super(cause);
    }
}
