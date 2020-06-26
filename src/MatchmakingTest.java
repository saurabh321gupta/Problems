import org.junit.Test;

import java.io.*;

public class MatchmakingTest {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        String[] x = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(MatchmakingTest.class.getResource("testCaseForMatchmaking.txt").getFile());
        System.setIn(fips);
        Matchmaking.main(x);
        System.setIn(original);
        System.out.flush();
        System.setOut(old);
        String expectedResult = "Aequitas,akS (88.5) vs bleh,Aequitas (87.5)\n" +
                "akS,lamiV (53.5) vs bleh,lamiV (52.5)\n" +
                "bleh,akS (86.0) vs bleh,Aequitas (87.5)\n" +
                "akS,lamiV (53.5) vs Aequitas,lamiV (55.0)\n" +
                "Aequitas,akS (88.5) vs bleh,akS (86.0)\n" +
                "Aequitas,lamiV (55.0) vs bleh,lamiV (52.5)\n" +
                "Aequitas,lamiV (55.0) vs bleh,akS (86.0)\n" +
                "Aequitas,lamiV (55.0) vs bleh,Aequitas (87.5)\n" +
                "akS,lamiV (53.5) vs bleh,akS (86.0)\n" +
                "bleh,lamiV (52.5) vs bleh,akS (86.0)\n" +
                "Aequitas,lamiV (55.0) vs Aequitas,akS (88.5)\n" +
                "akS,lamiV (53.5) vs bleh,Aequitas (87.5)\n" +
                "bleh,lamiV (52.5) vs bleh,Aequitas (87.5)\n" +
                "akS,lamiV (53.5) vs Aequitas,akS (88.5)\n" +
                "Aequitas,akS (88.5) vs bleh,lamiV (52.5)\n";
        String actualResult = baos.toString();
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
