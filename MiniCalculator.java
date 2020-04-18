/**
 * This class extends Calculator and overrides the calculate method.
 *
 * JDK version: 11.0.3
 *
 * @author  Kyrel Polifrone || 822711442 || CS108 Section 04
 * @version 1.0.0
 * @since   04-18-2020
 */

public class MiniCalculator extends Calculator {
    /**
     * This method overrides the calculate method from Calculator.
     * @return total - returns the total int.
     */
    @Override
    public int calculate() {
        return total;
    }
}
