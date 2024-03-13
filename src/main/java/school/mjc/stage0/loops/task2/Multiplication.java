package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        boolean pos = true;

        if(multiplyByAndToInclusive>0) {
            while (i <= multiplyByAndToInclusive) {
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        }else{

        }
    }
}
