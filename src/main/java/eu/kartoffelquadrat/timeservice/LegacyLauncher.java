/**
 * @Author: Maximilian Schiedermeier
 * @Date: June 2021
 */
package eu.kartoffelquadrat.timeservice;

/**
 * Vanilla java launcher class.
 */
public class LegacyLauncher {

    /**
     * Default legacy launcher class. Invokes the time oracle to tell the time when called.
     * @param args default runtime arguments (ignored).
     */
    public static void main(String[] args) {

        // Retrieves a time oracle instance, calls getTime and prints the result.
        System.out.println(TimeOracle.getInstance().getTime());
    }
}

