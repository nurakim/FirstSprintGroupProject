import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTest {

        Calculator c = new Calculator();

        @Test
        public void verifyFirstNumberIsOne1() {
            int expectedResult = 2;
            int a = 1, b = 2;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);
        }

        @Test
        public void verifyFirstNumberIsNegative2() {
            int expectedResult = -2;
            int a = -1, b = 2;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);
        }

        @Test
        public void verifySecondNumberIsNegative3() {
            int expectedResult = -2;
            int a = 1, b = -2;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);

        }

        @Test
        public void verifyBothNumbersAreNegative4() {
            int expectedResult = 2;
            int a = -1, b = -2;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);


        }

        @Test
        public void verifySecondNumberIsOne5() {
            int expectedResult = 2;
            int a = 2, b = 1;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);

        }

        @Test
        public void verifyFirstNumberIsZero6() {
            int expectedResult = 0;
            int a = 0, b = 1;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);


        }

        @Test (expected = ArithmeticException.class)
        public void verifyBothNumbersAreZero7() {
            int expectedResult = 0;
            int a = 0, b = 0;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);
        }


        @Test
        public void verifySecondNumberIsZero8() {
            int expectedResult = 0;
            int a = 1, b = 0;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);
        }

        @Test
        public void verifyBothNumbersAreOne9() {
            int expectedResult = 1;
            int a = 1, b = 1;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);
        }


        @Test
        public void verifyBothNumbersAreLarge() {
            int expectedResult = 10000;
            int a = 100, b = 100;
            int actualResult = c.mul(a, b);
            String message = "expected=" + expectedResult + ":actual=" + actualResult;
            Assert.assertTrue(message, expectedResult == actualResult);
        }




    }

