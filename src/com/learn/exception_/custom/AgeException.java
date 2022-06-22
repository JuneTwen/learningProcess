package com.learn.exception_.custom;

public class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int age = 8;
        if(!(age >= 18 && age <=120)){
            throw new AgeException("Error!");
        }
        System.out.println("true");
    }
}
