package de.NeueFische.cologne;

public class CheckPassword {


    public static void main(String[] args) {
        String[] passwords = {"Password123", "Password234", "hallowelt", "1 2 3"};
        checkManyPasswords(passwords);
    }

    public static boolean checkPassword(String password){
        return checkPasswordLength(password) && checkPasswordForNumbers(password) && checkPasswordForCapitalLetters(password) && checkPasswordForSmallLetters(password);
    }


    public static void checkManyPasswords(String[] passwords) {
        for (int i = 0; i < passwords.length; i++) {
            System.out.println("Passwort: " + passwords[i] + "; Length: " + checkPasswordLength(passwords[i]) + "; Numbers: " + checkPasswordForNumbers(passwords[i]) + "; Capitals: " + checkPasswordForCapitalLetters(passwords[i]) + "; Small: " + checkPasswordForSmallLetters(passwords[i]) + "; Overall: " + checkPassword(passwords[i]));
        }
    }

    public static boolean checkPasswordLength(String password){
        int passwordLength = password.length();
        return passwordLength >= 8;
    }

    public static boolean checkPasswordForNumbers(String password) {
        boolean passwordHasNumbers = password.matches(".*\\d.*");
        return passwordHasNumbers;
    }

    public static boolean checkPasswordForCapitalLetters(String password) {
        boolean passwordHasCapitalLetters = password.matches(".*\\p{Upper}.*");
        return passwordHasCapitalLetters;
    }

    public static boolean checkPasswordForSmallLetters(String password) {
        boolean passwordHasSmallLetters = password.matches(".*\\p{Lower}.*");
        return passwordHasSmallLetters;
    }


}
