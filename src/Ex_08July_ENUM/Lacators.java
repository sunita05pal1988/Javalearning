package Ex_08July_ENUM;

public enum Lacators {
    page_input_email("#login-username"),
    page_input_password("#login-password"),
    page_button("#btn");

    private String locators;

    Lacators(String locators){
        this.locators = locators;
    }
    String getLocators(){
        return this.locators;
    }
}
