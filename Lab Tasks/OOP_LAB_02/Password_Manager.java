class PasswordMan{
    private String pass = "Alignment";

    void changePassword(String oldPass, String newPass)
    {
        if(oldPass.equals(pass))
        {
            pass = newPass;
            System.out.println("Your Password is Changed");

        }
        else
        {
            System.out.println("Password not match with old one");
        }
    }

    void validatePassword(String passw)
    {
        if(passw.equals(pass))
        {
            System.out.println("Your Password is Correct");
        }
        else
        {
            System.out.println("Your Password is incorrect");
        }
    }
}

public class Password_Manager{
    public static void main(String[] args) {
        PasswordMan p = new PasswordMan();
        p.changePassword("Alignment","Pakistan");
        p.validatePassword("Pakistan");
    }
}