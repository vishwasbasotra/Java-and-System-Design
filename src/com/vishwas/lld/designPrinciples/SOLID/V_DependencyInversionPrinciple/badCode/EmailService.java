package com.vishwas.lld.designPrinciples.SOLID.V_DependencyInversionPrinciple.badCode;

// Low-level module
public class EmailService {
    public void sendEmail(String msg){
        System.out.println("Email: "+msg);
    }
}
