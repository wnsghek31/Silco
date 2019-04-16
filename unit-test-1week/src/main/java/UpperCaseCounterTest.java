import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {

    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void getNumberOfUpperCaseCharactersInString() {
        String str = null;

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result==0);

    }

    @Test
    public void 빈값체크(){
        String str = "";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertTrue(result == 0);
    }

    @Test
    public void 대문자_ABCcdefGHI(){
        String str = "ABCcdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        System.out.println("resukt :: "+ result);
        assertTrue(result == 6);
        assertFalse(result==5);
    }
}