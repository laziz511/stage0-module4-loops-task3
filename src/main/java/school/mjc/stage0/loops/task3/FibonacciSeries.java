package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci==1){
            System.out.println("0");
            return;
        }else{
            int first = 0, second = 1, third;
            for(int i=1; i<=lastFibonacci; i++){
                System.out.println(first);
                third = second + first;
                first = second;
                second = third;
            }
        }
        
        
    }
}
