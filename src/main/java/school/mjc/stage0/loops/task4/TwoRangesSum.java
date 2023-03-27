package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int sumSkip = 0;
            for (int i = 1; i <= numberToSkip; i++) {
                sumSkip += i;
            }
            int sumContinue = 0;
            for (int i = numberToSkip + 1; i <= lastInRow; i++) {
                sumContinue += i;
            }
            System.out.println("skipped sum is " + sumSkip);
            System.out.println("counted sum is " + sumContinue);
        }
    }
}
