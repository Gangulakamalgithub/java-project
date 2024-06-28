package com.email.java;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String Password;
    private String email;
    private String Department;
    private int emailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companyName = "soft.com";

    //constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Department = setDepartment();
        this.Password = randomPassword(defaultPasswordLength);
        System.out.println("Email Created: " + firstName + " " + lastName);
        //Call a method asking for the department -> return the department
        System.out.println("Department: " + Department);
        //Call a method asking for random password
        System.out.println("Your Password is: " + Password);
        //Combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + Department + "." + companyName;
        System.out.println("Your Email is: " + email);


    }
    //ask for the department

    private String setDepartment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("New Worker : " + firstName +". \nDepartment Code:  \n"+"1.Sale,\n2.Development,\n3.Accounting,\n4.None\n"+"department code : ");
        int depChoice = scanner.nextInt();
        if(depChoice == 1){
            return "Sale";
        }else if(depChoice == 2){
            return "dev";
        }else if(depChoice == 3) {
            return "acct";
        }else{
            return "none";
        }
    }
    // generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@$%#&";
        char[] password = new char[length];
        for (int i = 0; i< length; i ++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);

        }
        return new String(password);
    }

    // set the email capacity
    public void setEmailBoxCapacity(int capacity){
        this.emailBoxCapacity = capacity;
    }
    // set the alter name email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //change the password
    public void changePassword(String password){
        this.Password = password;
    }
    public int getEmailBoxCapacity(){
        return emailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return Password;
    }
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + emailBoxCapacity + "mb" ;
    }



}
