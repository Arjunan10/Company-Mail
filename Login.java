package com.emailApp;

import java.util.Scanner;

public class Login {

    private String userName;
    private String userId;
    private String department;
    private String randomMailId;
    private String companyName = "TCSCompany";

    Scanner user = new Scanner(System.in);

    public Login(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;


        System.out.println(" ************************************");
        System.out.println("     Account Created Succesfully ;-)         ");
        System.out.println(" ************************************");
        System.out.println("\n");

        System.out.println(" Hi " + userName);

        System.out.println(" Your ID : " + userId);

        this.department = setDepartment();
        this.randomMailId = userCompanyMailId();
        System.out.println("\n");
    }

    private String setDepartment() {
        System.out.println("*********************************");
        System.out.println(" Department Codes :\n1.SOFTWARE ENGINEER\n2.CLOUD MARKETING\n3.ANDROID DEVELOPMENT");
        System.out.println("4.DESIGN\n5.OTHER ");
        System.out.println("*********************************");
        System.out.println("\n");
        System.out.println(" CHOOSE ANY DEPARTMENT: ");

        int depchoice = user.nextInt();
        if (depchoice == 1) {
            return "softeng";
        } else if (depchoice == 2) {
            return "cldmrk";
        } else if (depchoice == 3) {
            return "andrddev";
        } else if (depchoice == 4) {
            return "dsg";
        } else {
            return " ";
        }
    }

    private String userCompanyMailId() {
        String id = userName.toLowerCase() + userId.toLowerCase() + "@" + department + "." + companyName.toLowerCase() + "." + "com";

        System.out.println("Your Company Mail id : ");
        System.out.println(id.trim());
        return "";


}
}


