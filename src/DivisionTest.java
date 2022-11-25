import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {
    Calculator c = new Calculator();
      @Test
    public void verifyFirstNumberLessThanSecondNumber(){
       int expectedResult = 0;
       int a =5, b =15;
       int actualResult = c.div(a,b);
          String message = "Expected = " + expectedResult + " : Actual = " + actualResult;
          Assert.assertTrue(message, expectedResult == actualResult);
          System.out.println("VerifyFirstNumberLessThanSecondNumber -> Test Passed" );

    }
    @Test
    public void verifyBothNumbersAreEqual(){
          int expectedResult = 1;
          int a = 10, b = 10;
          int actualResult = c.div(a, b);
          String message = "Expected = " +expectedResult + ": Actual = " + actualResult;
          Assert.assertTrue(message,expectedResult == actualResult);
        System.out.println("VerifyBothNumbersAreEqual -> Test Passed");

    }

    @Test
    public void verifyFirstNumberIsZero() {
        int expectedResult = 0;
        int a = 0, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyFirstNumberIsZero -> Test Passed");
    }

    @Test
    public void verifyFirstNumberIsGreaterThanSecondNumber() {
        int expectedResult = 2;
        int a = 20, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyFirstNumberIsGreaterThanSecondNumber -> Test Passed");

    }

    @Test
    public void verifyBothNumbersAreNegative() {
        int expectedResult = 2;
        int a = -20, b = -10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyBothNumbersAreNegative -> Test Passed");

    }

    @Test
    public void verifySecondNumberIsNegative() {
        int expectedResult = -2;
        int a = 20, b = -10;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifySecondNumberIsNegative -> Test Passed");


    }



    @Test
    public void verifySecondNumberIsOne() {
        int expectedResult = 5;
        int a = 5, b = 1;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifySecondNumberIsOne -> Test Passed");


    }

    @Test
    public void verifyBothNumbersAreLarge() {
        int expectedResult = 4;
        int a = 10000, b = 2500;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyBothNumbersAreLarge-> Test Passed");
    }
    @Test // (expected = ArithmeticException.class)
    public void verifySecondNumberIsZero() {
        int expectedResult = 0;
        int a = 10, b = 0;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ": actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifySecondNumberIsZero -> Test Failed (expected = ArithmeticException.class)");
    }
    @Test // (expected = ArithmeticException.class)
    public void verifyBothNumbersAreZero() {
        int expectedResult = 0;
        int a = 0, b = 0;
        int actualResult = c.div(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyBothNumbersAreZero  -> Test Failed(expected = ArithmeticException.class)");

    }

}
