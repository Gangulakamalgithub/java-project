package com.email.java;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("kamal","Gangula");

        System.out.println(email.showInfo());

        /*email.setAlternateEmail("kml@gmail");
        System.out.println(email.getAlternateEmail());*/

    }
}
