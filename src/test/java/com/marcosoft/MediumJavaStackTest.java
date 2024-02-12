package com.marcosoft;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class MediumJavaStackTest {

    MediumJavaStack app = new MediumJavaStack();

    @Test
    void shouldReturnTrueTest1() {
        String originalString = "{}";
        boolean isBalanced = app.isBalanced(originalString);
        assertTrue(isBalanced);
    }

    @Test
    void shouldReturnTrueTest2() {
        String originalString = "{[()]}";
        boolean isBalanced = app.isBalanced(originalString);
        assertTrue(isBalanced);
    }

    @Test
    void shouldReturnTrueTest3() {
        String originalString = "[({()})]";
        boolean isBalanced = app.isBalanced(originalString);
        assertTrue(isBalanced);
    }

    @Test
    void shouldReturnTrueTest4() {
        String originalString = "()[]{}";
        boolean isBalanced = app.isBalanced(originalString);
        assertTrue(isBalanced);
    }

    @Test
    void shouldReturnTrueTest5() {
        String originalString = "[]";
        boolean isBalanced = app.isBalanced(originalString);
        assertTrue(isBalanced);
    }

    @Test
    void shouldReturnTrueTest6() {
        String originalString = "[]{}(){()}((())){{{}}}{()()}{{}{}}";
        boolean isBalanced = app.isBalanced(originalString);
        assertTrue(isBalanced);
    }
    @Test
    void shouldReturnTrueTest7() {
        String originalString = "({(){}()})()({(){}()})(){()}";
        boolean isBalanced = app.isBalanced(originalString);
        assertTrue(isBalanced);
    }

    @Test
    void shouldReturnTrueFalse1() {
        String originalString = "{}}";
        boolean isBalanced = app.isBalanced(originalString);
        assertFalse(isBalanced);
    }
    @Test
    void shouldReturnTrueFalse2() {
        String originalString = "{}(]";
        boolean isBalanced = app.isBalanced(originalString);
        assertFalse(isBalanced);
    }

    @Test
    void shouldReturnTrueFalse3() {
        String originalString = "}{";
        boolean isBalanced = app.isBalanced(originalString);
        assertFalse(isBalanced);
    }
    @Test
    void shouldReturnTrueFalse4() {
        String originalString = "}}}}";
        boolean isBalanced = app.isBalanced(originalString);
        assertFalse(isBalanced);
    }
    @Test
    void shouldReturnTrueFalse5() {
        String originalString = "}()";
        boolean isBalanced = app.isBalanced(originalString);
        assertFalse(isBalanced);
    }
    @Test
    void shouldReturnTrueFalse6() {
        String originalString = "{{{{{{{)))))))))))))))))))";
        boolean isBalanced = app.isBalanced(originalString);
        assertFalse(isBalanced);
    }
    @Test
    void shouldReturnTrueFalse7() {
        String originalString = "{}}}{}";
        boolean isBalanced = app.isBalanced(originalString);
        assertFalse(isBalanced);
    }


}