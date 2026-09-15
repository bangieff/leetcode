import easy.TestEasy;
import hard.TestHard;
import medium.TestMedium;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TestEasy testEasy = new TestEasy();
        testEasy.runTests();

        TestMedium testMedium = new TestMedium();
        testMedium.runTests();

        TestHard testHard = new TestHard();
        testHard.runTests();
    }

}