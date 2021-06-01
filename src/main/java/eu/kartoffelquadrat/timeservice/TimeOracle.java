/**
 * @Author: Maximilian Schiedermeier
 * @Date: June 2021
 */
package eu.kartoffelquadrat.timeservice;

/***
 * This singleton tells you the time.
 */
public class TimeOracle {

    // private singleton reference
    private static TimeOracle singletonReference = null;

    // private default constructor
    private TimeOracle() {
    }

    /**
     * Singleton pattern getter.
     */
    public static TimeOracle getInstance() {
        if (singletonReference == null)
            singletonReference = new TimeOracle();
        return singletonReference;
    }

    /**
     * Gateway method to access service functionality. It tells the time.
     *
     * @return String the time string.
     */
    public String getTime() {
        return "It's about teatime!";
    }
}
