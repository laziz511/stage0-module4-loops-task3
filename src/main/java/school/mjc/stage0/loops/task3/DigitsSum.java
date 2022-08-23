package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int summa = 0;
        while(t>0){
            summa += t%10;
            t /=10;
        }
        System.out.println(summa);

    }
}
