package com.greatlearning.service;

import com.greatlearning.model.Employee;

public class CredentialService {

    public String generatePassword() {

        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789#$*%!";
        char[] password = new char[8];
        for (int i = 0; i < 8; i++) {
            int random = (int) (Math.random() * value.length());
            password[i] = value.charAt(random);

        }

        return new String(password);

    }
    public String generateEmailAddress(String firstName,String lastName,String department){


        return firstName+lastName+"@"+department+".abc.com";

    }

    public void ShowCredential(Employee employee, String email, String generatePassword){



        System.out.println("Dear "+employee.getFirstname()+ " your generated credentials are as follows");
        System.out.println("email------>"+email);
        System.out.print("password------>"+"");
        System.out.println(generatePassword);

    }

    }