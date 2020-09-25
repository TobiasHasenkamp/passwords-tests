package de.NeueFische.cologne;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class CheckPasswordTest {

    @Test
    @DisplayName("Passwort muss 8 Zeichen lang sein")
    public void testIsPasswordLongerThan8True() {
        //Given
        String password = "1234hallo";
        //When
        boolean passwordIsLongerThan8 = CheckPassword.checkPasswordLength(password);
        //Then
        assertTrue(passwordIsLongerThan8);
    }

    @Test
    @DisplayName("Passwort muss mindestens eine Zahl enthalten")
    public void testHasPasswordNumbersTrue() {
        //Given
        String password = "1111hallo";
        //When
        boolean passwordHasNumbers = CheckPassword.checkPasswordForNumbers(password);
        //Then
        assertTrue(passwordHasNumbers);
    }

    @Test
    @DisplayName("Passwort muss mindestens eine Zahl enthalten")
    public void testHasPasswordNumbersFalse() {
        //Given
        String password = "halloanAlle";
        //When
        boolean passwordHasNumbers = CheckPassword.checkPasswordForNumbers(password);
        //Then
        assertFalse(passwordHasNumbers);
    }

    @Test
    @DisplayName("Passwort muss mindestens einen Großbuchstaben enthalten")
    public void testHasPasswordCapitalLettersTrue() {
        //Given
        String password = "halloanAlle1";
        //When
        boolean passwordHasCapitalLetters = CheckPassword.checkPasswordForCapitalLetters(password);
        //Then
        assertTrue(passwordHasCapitalLetters);
    }

    @Test
    @DisplayName("Passwort muss mindestens einen Großbuchstaben enthalten")
    public void testHasPasswordCapitalLettersFalse() {
        //Given
        String password = "halloanalle1";
        //When
        boolean passwordHasCapitalLetters = CheckPassword.checkPasswordForCapitalLetters(password);
        //Then
        assertFalse(passwordHasCapitalLetters);
    }

    @Test
    @DisplayName("Passwort muss mindestens einen Kleinbuchstaben enthalten")
    public void testHasPasswordSmallLettersTrue() {
        //Given
        String password = "HalloIhr1323";
        //When
        boolean passwordHasSmallLetters = CheckPassword.checkPasswordForSmallLetters(password);
        //Then
        assertTrue(passwordHasSmallLetters);
    }

    @Test
    @DisplayName("Passwort muss mindestens einen Kleinbuchstaben enthalten")
    public void testHasPasswordSmallLettersFalse() {
        //Given
        String password = "HEYIHRALLE123";
        //When
        boolean passwordHasSmallLetters = CheckPassword.checkPasswordForSmallLetters(password);
        //Then
        assertFalse(passwordHasSmallLetters);
    }

    @Test
    @DisplayName("Erfüllt das Password alle vier Kritierien?")
    public void testIsPasswordGoodTrue() {
        //Given
        String password = "ThisIsAGoodPassword123";
        //When
        boolean passwordIsGood = CheckPassword.checkPassword(password);
        //Then
        assertTrue(passwordIsGood);
    }

    @Test
    @DisplayName("Erfüllt das Password alle vier Kritierien?")
    public void testIsPasswordGoodFalse() {
        //Given
        String password = "notaverygoodpassword123";
        //When
        boolean passwordIsGood = CheckPassword.checkPassword(password);
        //Then
        assertFalse(passwordIsGood);
    }


}