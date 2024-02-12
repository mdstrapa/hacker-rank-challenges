package com.marcosoft;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MediumJavaStackParameterizedTest {

    MediumJavaStack app = new MediumJavaStack();

    @ParameterizedTest
    @CsvFileSource(resources = "/MediumJavaStackValidInputs.txt")
    void should_Return_True_For_Balanced_Strings(String input) {
        boolean passwordValidation = app.isBalanced(input);
        assertTrue(passwordValidation);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/MediumJavaStackInvalidInputs.txt")
    void should_Return_False_For_Inbalanced_Strings(String input){
        boolean passwordValidation = app.isBalanced(input);
        assertFalse(passwordValidation);
    }

}
