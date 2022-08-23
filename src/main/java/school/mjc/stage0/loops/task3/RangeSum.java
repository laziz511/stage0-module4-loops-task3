package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int summa = 0;
        for(; firstBoarder<=secondBoarder; firstBoarder++){
            summa += firstBoarder;
        }
        System.out.println(summa);
    }
}
