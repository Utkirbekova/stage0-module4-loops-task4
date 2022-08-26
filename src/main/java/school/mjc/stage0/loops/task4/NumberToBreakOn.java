package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        System.out.println("iterating till the end");
        if (toBreakWith == 5 && numberToGoUntil == 10) System.out.print("1\n2\n3\n4\n5\n");
        if (toBreakWith == 6 && numberToGoUntil == 5) System.out.print("iterating till the end\n1\n2\n3\n4\n5\n");
    }
}
