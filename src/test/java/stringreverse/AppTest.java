package stringreverse;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class AppTest {

    App app = new App();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringReverseTest.csv")
    void should_Return_Valid_Reversed_String(String input,String expected) {
        //when
        String output = app.stringReverse(input);

        //then
        assertEquals(expected,output);
    }
}