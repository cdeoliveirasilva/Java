package com.emailapp;

import java.util.Scanner;

public class Email {
// private so no one can access this
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "design.com";
    private int defaultPassword = 10;

    // constructor to receive first + last name
    public Email(String firstName, String lastName){ // firstName and lastName here are local
        // this. refers to class level
        // = firstName and = lastName refer to local variable*
        // user input will be passed in parameter
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("NEW EMPLOYEE NAME: " + this.firstName + " " + this.lastName + "\n");

        // call a method asking for the department & return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department + "\n");

        // call a method that returns random password
        this.password = randomPassword(defaultPassword);
        //System.out.println("Your new password is: " + this.password + "\n");

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your new company email is: " + this.email);
    }

    // ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENTS: \n1 for UI\n2 for UX\n3 for Development\n0 for none\n\nEnter department code" + "\n");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){
            return "ui";
        } else if(departmentChoice == 2){
            return "ux";
        } else if (departmentChoice == 3){
            return "dev";
        } else return "";
    }

    // generate random password
    private String randomPassword(int length){
        String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int random = (int) (Math.random() * characters.length());
            password[i] = characters.charAt(random);
        }
        return new String(password);

    }


    // get employee's password
    public String getPassword(){
        return "\n Employee" + " " + lastName + "'s password is: " + password;
    }

    // get employee's email
    public String getEmail(){
        return "\n Employee" + " " + lastName + "'s email is: " + email;
    }

    // get employee's department
    public String getDepartment(){
        return "\n Employee" + " " + lastName + "'s department is: " + department;
    }

    // show employee information
    public String showInfo(){
        return " EMPLOYEE NAME: " + firstName + " " + lastName +
                "\n DEPARTMENT: " + department +
                "\n COMPANY EMAIL: " + email +
                "\n PASSWORD: " + this.password;
    }
}
