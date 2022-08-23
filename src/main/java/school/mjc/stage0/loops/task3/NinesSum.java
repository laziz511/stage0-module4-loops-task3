package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int summa = 9;
        int initial = 9;
        for (int i = 1; i<lengthOfLastNumber; i++){
            initial = initial*10 + 9;
            summa += initial;
        }
        System.out.println(summa);

    }
}
