import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    Calculator c = new Calculator();
    @Test
    public void verifyFirstNumberLessThanSecondNumber(){
        int expectedResult = -5;
        int a =-10, b =5;
        int actualResult = c.add(a,b);
        String message = "Expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyFirstNumberLessThanSecondNumber -> Test Passed" );

    }
    @Test
    public void verifyWhenBothNumbersAreEqual(){
        int expectedResult = 20;
        int a = 10, b = 10;
        int actualResult = c.add(a, b);
        String message = "Expected = " +expectedResult + ": Actual = " + actualResult;
        Assert.assertTrue(message,expectedResult == actualResult);
        System.out.println("VerifyWhenBothNumbersAreEqual -> Test Passed");

    }
    @Test
    public void verifySecondNumberIsZero() {
        int expectedResult = 10;
        int a = 10, b = 0;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ": actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifySecondNumberIsZero -> Test Passed");

    }

    @Test
    public void verifyFirstNumberIsZero() {
        int expectedResult = 10;
        int a = 0, b = 10;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyFirstNumberIsZero -> Test Passed");
    }

    @Test
    public void verifyFirstNumberIsGreaterThanSecondNumber() {
        int expectedResult = 30;
        int a = 20, b = 10;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyFirstNumberIsGreaterThanSecondNumber -> Test Passed");

    }

    @Test
    public void verifyFirstNumberIsNegative() {
        int expectedResult = -10;
        int a = -20, b = 10;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyFirstNumberIsNegative -> Test Passed");

    }

    @Test
    public void verifyBothNumbersAreNegative() {
        int expectedResult = -30;
        int a = -20, b = -10;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyBothNumbersAreNegative -> Test Passed");

    }

    @Test
    public void verifySecondNumberIsNegative() {
        int expectedResult = 10;
        int a = 20, b = -10;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifySecondNumberIsNegative -> Test Passed");


    }

    @Test
    public void verifyBothNumbersAreZero() {
        int expectedResult = 0;
        int a = 0, b = 0;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyBothNumbersAreZero  -> Test Passed");

    }

    @Test
    public void verifySecondNumberIsOne() {
        int expectedResult = 6;
        int a = 5, b = 1;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifySecondNumberIsOne -> Test Passed");


    }

    @Test
    public void verifyBothNumbersAreLarge() {
        int expectedResult = 11000;
        int a = 10000, b = 1000;
        int actualResult = c.add(a, b);
        String message = "expected=" + expectedResult + ":actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
        System.out.println("VerifyBothNumbersAreLarge-> Test Passed");
    }
}
