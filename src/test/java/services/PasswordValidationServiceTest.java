package services;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordValidationServiceTest {

    @Test
    public void passwordValidation() {
        PasswordValidationService pvs= new PasswordValidationService();
        assertEquals(0, pvs.passwordValidation("Ab1!@#"));
        assertEquals(1, pvs.passwordValidation("AbS!@#"));
        assertEquals(2, pvs.passwordValidation("Ab!@"));
        assertEquals(3, pvs.passwordValidation("Ya3"));
        assertEquals(3, pvs.passwordValidation("TESTSSS"));
        assertEquals(4, pvs.passwordValidation("a1"));
        assertEquals(5, pvs.passwordValidation("b"));
    }
}