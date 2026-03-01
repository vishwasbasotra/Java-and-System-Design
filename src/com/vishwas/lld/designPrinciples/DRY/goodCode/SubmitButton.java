package com.vishwas.lld.designPrinciples.DRY.goodCode;

import javax.swing.*;

/*
In this approach, if you introduce new buttons, you do not need to repeat the onClick() implementation each time.
The code would simply need to override the onClick() method of the abstract class and implement its own logic for
each new button type. This ensures that the common behavior is defined in the abstract class, while the specific
behavior for each button type is implemented in the subclasses.
 */
abstract class Button{
    private String label;

    public Button(String label) {
        this.label = label;
    }
    void render(){
        System.out.println("Rendering button: "+label);
    }

    abstract void onClick();
}

class SubmitButton extends Button {
    public SubmitButton(String label) {
        super(label);
    }

    @Override
    void onClick() {
        System.out.println("Form Submitted.");
    }
}

class CancelButton extends Button {
    public CancelButton(String label) {
        super(label);
    }

    @Override
    void onClick() {
        System.out.println("Form Cancelled.");
    }
}

class Main {
    public static void main(String[] args) {
        Button submitButton = new SubmitButton("Submit");
        Button cancelButton = new CancelButton("Cancel");

        submitButton.onClick();
        submitButton.render();

        System.out.println("----------------------------------");

        cancelButton.onClick();
        cancelButton.render();
    }
}
