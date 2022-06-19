package com.greatlearning.service;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import java.util.Scanner;
public class DriverClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee("abhishek","pujara");
        CredentialService cs = new CredentialService();
        int ch = sc.nextInt();
        System.out.println("Please Enter Department From Following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        switch (ch){
            case 1:
            String EmailAddress = cs.generateEmailAddress(obj.getFirstname(),obj.getLastName(),"tech");
            String Password = cs.generatePassword();
            cs.ShowCredential(obj,EmailAddress,Password);
            break;
            case 2:
                String emailadd = cs.generateEmailAddress(obj.getFirstname(),obj.getLastName(),"adm");
                String pass = cs.generatePassword();
                cs.ShowCredential(obj,emailadd,pass);
                break;
            case 3:
                String emailadd2 = cs.generateEmailAddress(obj.getFirstname(),obj.getLastName(),"hmnr");
                String Password2 = cs.generatePassword();
                cs.ShowCredential(obj,emailadd2,Password2);
                break;
            case 4:
                String emailadd3 = cs.generateEmailAddress(obj.getFirstname(),obj.getLastName(),"legal");
                String Password3 = cs.generatePassword();
                cs.ShowCredential(obj,emailadd3,Password3);
                break;
            default:
        }


    }
}
