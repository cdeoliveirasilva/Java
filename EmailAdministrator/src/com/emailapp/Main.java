package com.emailapp;

public class Main {

    public static void main(String[] args) {

        Email email = new Email("Jane", "Doe");
        System.out.println(email.showInfo());
        // System.out.println(email.getPassword());
        // System.out.println(email.getEmail());
        // System.out.println(email.getDepartment());
    }
}