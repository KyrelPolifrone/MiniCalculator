/**
 * This class conducts unit tests for the multiply method, divide method, and calculate method
 *
 * JDK version: 11.0.3
 *
 * @author  Kyrel Polifrone || 822711442 || CS108 Section 04
 * @version 1.0.0
 * @since   04-18-2020
 */

public class UnitTests {

    public static void main(String[] args) {
        multiplyTest();
        divideTest();
        calculatorTest();
    }

    /**
     * Tests the multiply method by conducting two consecutive positive number tests, two negative number tests
     * and dividing by zero. If a test is successful, it prints SUCCESS and the test to the console, if it fails,
     * it print FAILED and the test, as well as the value expected and what was received.
     */
    public static void multiplyTest() {

        // Testing positive number
        MiniCalculator multiPositiveCalc = new MiniCalculator(); // creates new object which will have methods called on it
        multiPositiveCalc.multiply(5);
        try {
            if (multiPositiveCalc.calculate() != 5) {
                throw new Exception();
            }
            System.out.println("SUCCESS MULTIPLY OF POSITIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED MULTIPLY OF A POSITIVE NUMBER, NUMBER EXPECTED 5, NUMBER RETURNED: " + multiPositiveCalc.calculate());
        }

        // Testing to see if multiplier properly incorporates previous call
        multiPositiveCalc.multiply(10);
        try {
            if (multiPositiveCalc.calculate() != 50) {
                throw new Exception();
            }
            System.out.println("SUCCESS MULTIPLY OF SECOND POSITIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED MULTIPLY OF A SECOND POSITIVE NUMBER, NUMBER EXPECTED 50, NUMBER RETURNED: " + multiPositiveCalc.calculate());
        }

        // Testing negative number
        MiniCalculator multiNegativeCalc = new MiniCalculator();
        multiNegativeCalc.multiply(-5);
        try {
            if (multiNegativeCalc.calculate() != -5) {
                throw new Exception();
            }
            System.out.println("SUCCESS MULTIPLY OF NEGATIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED MULTIPLY OF A NEGATIVE NUMBER, NUMBER EXPECTED -5, NUMBER RETURNED: " + multiNegativeCalc.calculate());
        }

        // Testing to see if multiplier properly incorporates previous call
        multiNegativeCalc.multiply(-10);
        try {
            if (multiNegativeCalc.calculate() != 50) {
                throw new Exception();
            }
            System.out.println("SUCCESS MULTIPLY OF SECOND NEGATIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED MULTIPLY OF A SECOND NEGATIVE NUMBER, NUMBER EXPECTED 50, NUMBER RETURNED: " + multiNegativeCalc.calculate());
        }

        // Testing zero
        MiniCalculator multiZeroCalc = new MiniCalculator();
        multiZeroCalc.multiply(0);
        try {
            if (multiZeroCalc.calculate() != 0) {
                throw new Exception();
            }
            System.out.println("SUCCESS MULTIPLY OF ZERO");
        } catch (Exception e) {
            System.out.println("FAILED MULTIPLY OF A ZERO, NUMBER EXPECTED 0, NUMBER RETURNED: " + multiZeroCalc.calculate());
        }
    }

    /**
     * Tests the divide method by conducting two consecutive positive number tests and two negative number
     * tests. If a test is successful, it prints SUCCESS and the test to the console, if it fails, it print
     * FAILED and the test, as well as the value expected and what was received.
     */
    public static void divideTest() {

        // Testing positive value
        MiniCalculator dividerPositiveCalc = new MiniCalculator();
        dividerPositiveCalc.divide(5);
        try {
            if (dividerPositiveCalc.calculate() != 0) {
                throw new Exception();
            }
            System.out.println("SUCCESS DIVIDE OF POSITIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED DIVIDE OF POSITIVE NUMBER, NUMBER EXPECTED 0, NUMBER RETURNED: " + dividerPositiveCalc.calculate());
        }

        // Testing to see if divide properly incorporates previous call
        dividerPositiveCalc.divide(5);
        try {
            if (dividerPositiveCalc.calculate() != 0) {
                throw new Exception();
            }
            System.out.println("SUCCESS DIVIDE OF SECOND POSITIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED DIVIDE OF SECOND POSITIVE NUMBER, NUMBER EXPECTED 0, NUMBER RETURNED: " + dividerPositiveCalc.calculate());
        }

        // Testing negative value
        MiniCalculator dividerNegativeCalc = new MiniCalculator();
        dividerNegativeCalc.divide(5);
        try {
            if (dividerNegativeCalc.calculate() != 0) {
                throw new Exception();
            }
            System.out.println("SUCCESS DIVIDE OF NEGATIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED DIVIDE OF NEGATIVE NUMBER, NUMBER EXPECTED 0, NUMBER RETURNED: " + dividerNegativeCalc.calculate());
        }

        // Testing to see if divide properly incorporates previous call
        dividerNegativeCalc.divide(5);
        try {
            if (dividerNegativeCalc.calculate() != 0) {
                throw new Exception();
            }
            System.out.println("SUCCESS DIVIDE OF SECOND NEGATIVE NUMBER");
        } catch (Exception e) {
            System.out.println("FAILED DIVIDE OF SECOND NEGATIVE NUMBER, NUMBER EXPECTED 0, NUMBER RETURNED: " + dividerNegativeCalc.calculate());
        }
    }

    /**
     * Tests the calculate method by checking if the starting value is 1. If it is, it prints SUCCESS, if not, it
     * prints FAILED with the expected number as well as the number received.
     */
    public static void calculatorTest() {
        // Testing calculate method to see if it was initialized correctly
        MiniCalculator calcNum = new MiniCalculator();
        try {
            if (calcNum.calculate() != 1) {
                throw new Exception();
            }
            System.out.println("SUCCESS DECLARATION OF CALCULATE METHOD");
        } catch (Exception e) {
            System.out.println("FAILED DECLARATION OF CALCULATE METHOD, NUMBER EXPECTED 1, NUMBER RETURNED: " + calcNum.calculate());
        }
    }
}
