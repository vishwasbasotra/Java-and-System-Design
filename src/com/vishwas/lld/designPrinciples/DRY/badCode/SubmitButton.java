package com.vishwas.lld.designPrinciples.DRY.badCode;
/*
In this implementation, we have separate classes (SubmitButton and CancelButton), each with its own onClick() method.

In this approach, if you introduce new buttons, you would need to repeat the onClick() implementation each time.
This is a violation of the DRY principle, as the code would need to duplicate logic for every new button type.
If the button logic were more complex, this could lead to increased maintenance, inconsistencies, and errors,
as every time we add a new button, we must remember to write the same onClick() logic.
 */
class SubmitButton {
    void onClick(){
        System.out.println("Form Submitted.");
    }
    void render(){
        System.out.println("Rendering button: Submit");
    }

}

class CancelButton {
    void onClick(){
        System.out.println("Form Cancelled.");
    }
    void render(){
        System.out.println("Rendering button: Cancel");
    }
}

class Main {
    public static void main(String[] args) {
        SubmitButton submitButton = new SubmitButton();
        CancelButton cancelButton = new CancelButton();

        submitButton.onClick();
        submitButton.render();

        System.out.println("----------------------------------");

        cancelButton.onClick();
        cancelButton.render();
    }
}
