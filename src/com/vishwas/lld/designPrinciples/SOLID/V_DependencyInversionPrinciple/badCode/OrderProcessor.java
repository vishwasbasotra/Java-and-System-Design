package com.vishwas.lld.designPrinciples.SOLID.V_DependencyInversionPrinciple.badCode;

// High-level module
public class OrderProcessor {
    // VIOLATION: Hardcoded dependency on a specific class
    private EmailService emailService;

    // High-level module
    public OrderProcessor() {
        this.emailService = new EmailService();
    }

    public void process(int OrderID){
        emailService.sendEmail("Order #"+OrderID+" is confirmer!");
    }
}
