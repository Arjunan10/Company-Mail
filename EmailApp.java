package com.emailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println(" ************************************* ");
        System.out.println  ("      || WELCOME TO AK COMPANY ||       ");
        System.out.println(" **************************************  ");
        System.out.println("\n");
        System.out.println(" Create Your new Mail id here ");
        System.out.println("\n");
        System.out.print("Enter Your Sweet Name : ");
        String newName = user.nextLine();
        System.out.println("\n");
        System.out.print(" Enter your new ID : ");
        String newId = user.nextLine();
         Login eml1 = new Login(newName,newId);
    }
}
